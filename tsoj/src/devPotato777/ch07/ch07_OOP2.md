# 객체지향 프로그래밍2

### 1. 상속(ingeritance)

#### `상속의 정의와 장점`

상속이란, 기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것이다.
상속을 통해서 클래스를 작성하면 보다 적은 양의 코드로 새로운 클래스를 작성할 수 있고 코드를 공통적으로 관리할 수 있기 때문에 코드의 추가 및 변경이 매우 용이하다.

이러한 특징은 코드의 재사용성을 높이고 코드의 중복을 제거하여 프로그램의 생산성과 유지보수에 크게 기여한다.

자바에서 상속을 구현하는 방법은 새로 작성하고자 하는 클래스의 이름 뒤에 상속받고자 하는 클래스의 이름을 키워드 'extends'와 함께 써 주기만 하면 된다.

예를 들어 새로 작성하려는 클래스의 이름이 Child이고 상속받고자 하는 기존 클래스의 이름이 Parent라면
class Child **extends Parent**{

​		// ...

}

이 두 클래스는 서로 상속 관계에 있다고 하며, 상속해주는 클래스를 '조상 클래스'라 하고 상속 받는 클래스를 '자손 클래스'라 한다.

**|참고|** 서로 상속관계에 있는 두 클래스를 아래와 같은 용어를 사용해서 표현하기도 한다.

```
조상 클래스			부모(parent)클래스, 상위(super)클래스, 기반(base)클래스
자손 클래스			자식(child)클래스, 하위(sub)클래스, 파생된(derived) 클래스
```

Child클래스에 새로운 코드가 추가되어도 조상인 Parent클래스는 아무런 영향도 받지 않는다.
조상 클래스가 변경되면 자손 클래스는 자동적으로 영향을 받게 되지만, 자손 클래스가 변경되는 것은 조상 클래스에 아무런 영향을 주지 못한다.

자손 클래스는 조상 클래스의 모든 멤버를 상속 받으므로 항상 조상 클래스보다 같거나 많은 멤버를 갖는다.
즉, 상속에 상속을 거듭할수록 상속받는 클래스의 멤버 개수는 점점 늘어나게 된다.

그래서 상속을 받는다는 것은 조상 클래스를 확장(extend)한다는 의미로 해석할 수도 있으며 이것이 상속에 사용되는 키워드가 'extends'인 이유이기도 하다.

```
- 생성자와 초기화 블럭은 상속되지 않는다. 멤버만 상속된다.
- 자손 클래스의 멤버 개수는 조상 클래스보다 항상 같거나 많다.
```

**|참고|** 접근 제어자(access modifier)가 private 또는 default인 멤버들은 상속되지 않는다기보다 상속은 받지만 자손 클래스로부터의 접근이 제한되는 것이다.

클래스 간의 관계에서 형제관계와 같은 것은 없다. 부모와 자식의 관계(상속관계)만이 존재할 뿐이다.

```
자손 클래스의 인스턴스를 생성하면 조상 클래스의 멤버와 자손 클래스의 멤버가 합쳐진 하나의 인스턴스로 생성된다.
```



#### `클래스간의 관계 - 포함관계`

상속이외에도 클래스를 재사용하는 방법이 있는데, 클래스간에 '포함(Composite)'관계를 맺어 주는 것이다.
클래스 간의 포함관계를 맺어 주는 것은 한 클래스의 멤버변수로 다른 클래스 타입의 참조변수를 선언하는 것을 뜻한다.

원(Circle)을 표현하기 위한 Circle이라는 클래스를 다음과 같이 작성하였다고 가정하자.

```java
class Circle {
    int x;		// 원점의 x좌표
    int y;		// 원점의 y좌표
    int r;		// 반지름(radius)
}
```

그리고 좌표상의 한 점을 다루기 위한 Point클래스가 다음과 같이 작성되어 있다고 하자.

```java
class Point {
    int x;		// x좌표
    int y;		// y좌표
}
```

Point클래스를 재사용해서 Circle클래스를 작성한다면 다음과 같이 할 수 있을 것이다.

```java
class Circle {
    Point c = new Point();	// 원점
    int r;
}
```

이와 같이 단위별로 여러 개의 클래스를 작성한 다음, 이 단위 클래스들을 포함관계로 재사용하면 보다 간결하고 손쉽게 클래스를 작성할 수 있다.
또한 작성된 단위 클래스들은 다른 클래스를 작성하느네 재사용될 수 있을 것이다.



#### `클래스간의 관계 결정하기`

'~은 ~이다(is-a)'와 '~은 ~을 가지고 있다(has-a)'를 넣어서 문장을 만들어 보면 클래스 간의 관계가 보다 명확해 진다.

```
원(Circle)은 점(Point)이다. - Circle is a Point.
원(Circle)은 점(Point)을 가지고 있다. - Circle has a Point.
```

원은 원점(Point)과 반지름으로 구성되므로 첫 번째 문장보다 두 번째 문장이 더 옳다는 것을 알 수 있을 것이다.

이처럼 클래스를 가지고 문장을 만들었을 때 '~은 ~이다.'라는 문장이 성립한다면, 서로 상속관계를 맺어주고,
'~은 ~을 가지고 있다.'는 문장이 성립한다면 포함관계를 맺어 주면 된다.
그래서 Circle클래스와 Point클래스 간의 관계는 상속관계 보다 포함관계를 맺어 주는 것이 더 옳다.

```
상속관계		'~은 ~이다.(is-a)'
포함관계		'~은 ~을 가지고 있다.(has-a)'
```

**|참고|** 프로그램의 모든 클래스를 분석하여 가능한 많은 관계를 맺도록 노력해서 코드의 재사용성을 높여야 한다.



#### `단일 상속(single inheritance)`

자바에서는 오직 단일 상속만을 허용한다.

다중상속을 허용하면 여러 클래스로부터 상속받을 수 있기 때문에 복합적인 기능을 가진 클래스를 쉽게 작성할 수 있다는 장점이 있지만,
클래스간의 관계가 매우 복잡해진다는 것과 서로 다른 클래스로부터 상속받은 멤버간의 이름이 같은 경우 구별할 수 있는 방법이 없다는 단점을 가지고 있다.

단일 상속이 하나의 조상 클래스만을 가질 수 있기 때문에 다중상속에 비해 불편한 점도 있지만, 클래스 간의 관계가 보다 명확해지고 코드를 더욱 신뢰할 수 있게 만들어 준다는 점에서 다중상속보다 유리하다.



#### `Object클래스 - 모든 클래스의 조상`

Object클래스는 모든 클래스 상속계층도의 최상위에 있는 조상클래스이다.
다른 클래스로부터 상속 받지 않는 모든 클래스들은 자동적으로 Object클래스로부터 상속받게 함으로써 이것을 가능하게 한다.

**|참고|** 이미 어떤 클래스로부터 상속받도록 작성된 클래스에 대해서는 컴파일러가 'extends Object'를 추가하지 않는다.

Object클래스에는 toString(), equals()와 같은 모든 인스턴스가 가져야 할 기본적인 11개의 메서드가 정의되어 있다.



### 2. 오버라이딩(Overriding)

#### `오버라이딩이란?`

조상 클래스로부터 상속받은 메서드의 내용을 변경하는 것을 오버라이딩이라고 한다.
상속받은 메서드를 그대로 사용하기도 하지만, 자손 클래스 자신에 맞게 변경해야하는 경우가 많다.
이럴 때 조상의 메서드를 오버라이딩한다.

**|참고|** override의 사전적 의미는 '~위에 덮어쓰다(overwrite)'이다.



#### `오버라이딩의 조건`

오버라이딩은 메서드의 내용만을 새로 작성하는 것이므로 메서드의 선언부는 조상의 것과 완전히 일치해야 한다.

###### 오버라이딩이 성립하기 위한 조건

```
자손 클래스에서 오버라이딩하는 메서드는 조상 클래스의 메서드와
	- 이름이 같아야 한다.
	- 매개변수가 같아야 한다.
	- 반환타입이 같아야 한다.
```

**|참고|** JDK1.5부터 '공변 반환타입(covariant return type)'이 추가되어, 반환타입을 자손 클래스의 타입으로 변경하는 것은 가능하도록 조건이 완화되었다. p.457

한마디로 요약하면 선언부가 서로 일치해야 한다는 것이다. 
다만 접근 제어자(access modifier)와 예외(exception)는 제한된 조건 하에서만 다르게 변경할 수 있다.

1. **접근 제어자는 조상 클래스의 메서드보다 좁은 범위로 변경 할 수 없다.**

   만일 조상 클래스에 정의된 메서드의 접근 제어자가 protected라면,
   이를 오버라이딩하는 자손 클래스의 메서드는 접근 제어자가 protected나 public이어야 한다.
   대부분의 경우 같은 범위의 접근 제어자를 사용하다.
   접근 제어자의 접근범위를 넓은 것에서 좁은 것 순으로 나열하면 public, protected, (default), private이다.

2. **조상 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.**

   ```
조상 클래스의 메서드를 자손 클래스에서 오버라이딩할 때
   1. 접근제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
   2. 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다.
   3. 인스턴스메서드를 static메서드로 또는 그 반대로 변경할 수 없다.
   ```



#### `오버로딩 vs. 오버라이딩`

```
오버로딩 (overloading)		기존에 없는 새로운 메서드를 정의하는 것(new)
오버라이딩 (overriding)		상속받은 메서드의 내용을 변경하는 것(change, modify)
```

```java
class Parent {
    void parentMethod() {}
}

class Child extends Parent{
    void parentMethod() {}		// 오버라이딩
    void parentMethod(int i) {}	// 오버로딩
    
    void childMethod() {}
    void childMethod(int i) {}	// 오버로딩
    void childMethod() {}		// 에러. 중복정의 되었음
}
```



#### `super`

super는 자손 클래스에서 조상 클래스로부터 상속받은 멤버를 참조하는데 사용되는 참조변수이다.
멤버변수와 지역변수의 이름이 같을 때 this를 붙여서 구별했듯이 상속받은 멤버와 자신의 멤버와 이름이 같을 때는 super를 붙여서 구별할 수 있다.

조상클래스의 멤버와 자손클래스의 멤버가 중복 정의되어 서로 구별해야하는 경우에만 super를 사용하는 것이 좋다.

조상의 멤버와 자신의 멤버를 구별하는데 사용된다는 점을 제외하고는 super와 this는 근본적으로 같다.
모든 인스턴스메서드에는 자신이 속한 인스턴스의 주소가 지역변수로 저장되는데, 이것이 참조변수인 this와 super의 값이 된다.

static메서드(클래스메서드)는 인스턴스와 관련이 없다.
그래서 this와 마찬가지로 super 역시 static메서드에서는 사용할 수 없고 인스턴스메서드에서만 사용할 수 있다.



#### `super() - 조상 클래스의 생성자`

this()와 마찬가지로 super() 역시 생성자이다.
this()는 같은 클래스의 다른 생성자를 호출하는 데 사용되지만, super()는 조상 클래스의 생성자를 호출하는데 사용한다.

자손 클래스의 인스턴스를 생성하면, 자손의 멤버와 조상의 멤버가 모두 합쳐진 하나의 인스턴스가 생성된다.
그래서 자손 클래스의 인스턴스가 조상 클래스의 멤버들을 사용할 수 있는 것이다.
이 때 조상 클래스 멤버의 초기화 작업이 수행되어야 하기 때문에 자손 클래스의 생성자에서 조상 클래스의 생성자가 호출되어야 한다.

생성자의 첫 줄에서 조상클래스의 생성자를 호출해야하는 이유는 자손 클래스의 멤버가 조상 클래스의 멤버를 사용할 수도 있으므로 조상의 멤버들이 먼저 초기화되어 있어야 하기때문이다.

조상 클래스 생성자의 호출은 클래스의 상속관계를 거슬러 올라가면서 계속 반복된다.
마지막으로 모든 클래스의 최고 조상인 Object클래스의 생성자인 Object()까지 가서야 끝이 난다.

```
Object클래스를 제외한 모든 클래스의 생성자 첫 줄에 생성자, this() 또는 super() 를 호출해야 한다.
그렇지 않으면 컴파일러가 자동적으로 'super();'를 생성자의 첫 줄에 삽입한다.
```

인스턴스를 생성할 때는 클래스를 선택하는 것만큼 생성자를 선택하는 것도 중요하다.

```
1. 클래스 - 어떤 클래스의 인스턴스를 생성할 것인가?
2. 생성자 - 선택한 클래스의 어떤 생성자를 이용해서 인스턴스를 생성할 것인가?
```

**|주의|** 생성자가 정의되어 있는 클래스에는 컴파일러가 기본 생성자를 자동적으로 추가하지 않는다.

**조상 클래스의 멤버변수는 조상의 생성자에 의해 초기화되록 해야 한다.**