# BeanPostProcessor & BeanFactoryPostProcessor

Spring源码分析的例子

[博文地址](https://www.jianshu.com/p/fb39f568cd5e)
<https://www.jianshu.com/p/fb39f568cd5e>

## 项目运行后输出

```shell
BeanFactoryPostProcessor->postProcessBeanFactory
TestBean->TestBean
TestBean->setName
TestBean->setAge
testBean-->BeanPostProcessor->postProcessBeforeInitialization
TestBean->afterPropertiesSet
testBean-->BeanPostProcessor->postProcessAfterInitialization
TestBean->destroy
```