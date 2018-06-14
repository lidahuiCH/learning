package com.ldh.javacore.annotation;

import java.lang.annotation.*;

/**
 * Created on 2018/6/14.
 * 元标签有 @Retention、@Documented、@Target、@Inherited、@Repeatable 5 种。
 *
 * @Retention 的英文意为保留期的意思。当 @Retention 应用到一个注解上的时候，它解释说明了这个注解的的存活时间。
 * 它的取值如下：
 * - RetentionPolicy.SOURCE 注解只在源码阶段保留，在编译器进行编译时它将被丢弃忽视。
 * - RetentionPolicy.CLASS 注解只被保留到编译进行的时候，它并不会被加载到 JVM 中。
 * - RetentionPolicy.RUNTIME 注解可以保留到程序运行的时候，它会被加载进入到 JVM 中，所以在程序运行时可以获取到它们
 * @Target 是目标的意思，@Target 指定了注解运用的地方。
 * 你可以这样理解，当一个注解被 @Target 注解时，这个注解就被限定了运用的场景。
 * 类比到标签，原本标签是你想张贴到哪个地方就到哪个地方，但是因为 @Target 的存在，它张贴的地方就非常具体了，比如只能张贴到方法上、类上、方法参数上等等。@Target 有下面的取值
 * ElementType.ANNOTATION_TYPE 可以给一个注解进行注解
 * ElementType.CONSTRUCTOR 可以给构造方法进行注解
 * ElementType.FIELD 可以给属性进行注解
 * ElementType.LOCAL_VARIABLE 可以给局部变量进行注解
 * ElementType.METHOD 可以给方法进行注解
 * ElementType.PACKAGE 可以给一个包进行注解
 * ElementType.PARAMETER 可以给一个方法内的参数进行注解
 * ElementType.TYPE 可以给一个类型进行注解，比如类、接口、枚举
 * @Inherited 是继承的意思，但是它并不是说注解本身可以继承，而是说如果一个超类被 @Inherited 注解过的注解进行注解的话，那么如果它的子类没有被任何注解应用的话，那么这个子类就继承了超类的注解
 * @Repeatable 自然是可重复的意思。@Repeatable 是 Java 1.8 才加进来的，所以算是一个新的特性。
 * 什么样的注解会多次应用呢？通常是注解的值可以同时取多个。
 * <p>
 * 注解的提取
 * 博文前面的部分讲了注解的基本语法，现在是时候检测我们所学的内容了。
 * 我通过用标签来比作注解，前面的内容是讲怎么写注解，然后贴到哪个地方去，而现在我们要做的工作就是检阅这些标签内容。 形象的比喻就是你把这些注解标签在合适的时候撕下来，然后检阅上面的内容信息。
 * 要想正确检阅注解，离不开一个手段，那就是反射。
 * 注解与反射。
 * 注解通过反射获取。首先可以通过 Class 对象的 isAnnotationPresent() 方法判断它是否应用了某个注解
 * <p>
 * <p>
 * <p>
 * <p>
 * 注解是一系列元数据，它提供数据用来解释程序代码，但是注解并非是所解释的代码本身的一部分。注解对于代码的运行效果没有直接影响。
 * 注解有许多用处，主要如下：
 * - 提供信息给编译器： 编译器可以利用注解来探测错误和警告信息
 * - 编译阶段时的处理： 软件工具可以用来利用注解信息来生成代码、Html文档或者做其它相应处理。
 * - 运行时的处理： 某些注解可以在程序运行的时候接受代码的提取
 * 值得注意的是，注解不是代码本身的一部分。
 * 如果难于理解，可以这样看。罗永浩还是罗永浩，不会因为某些人对于他“傻x”的评价而改变，标签只是某些人对于其他事物的评价，但是标签不会改变事物本身，标签只是特定人群的手段。所以，注解同样无法改变代码本身，注解只是某些工具的的工具。
 * 还是回到官方文档的解释上，注解主要针对的是编译器和其它工具软件(SoftWare tool)。
 * 当开发者使用了Annotation 修饰了类、方法、Field 等成员之后，这些 Annotation 不会自己生效，必须由开发者提供相应的代码来提取并处理 Annotation 信息。这些处理提取和处理 Annotation 的代码统称为 APT（Annotation Processing Tool)。
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface TestAnnotation {
    public int id() default -1;

    public String msg() default "Hi";
}
