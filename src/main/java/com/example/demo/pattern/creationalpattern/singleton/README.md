# Singleton pattern principles
* Only one instance of class exist in JVM.
* Provide global access point to get instance.
* Use for: Logging, Drivers objects, caching and thread pool.

> Singleton means always one object should exist in the entire life of an application at any time. If a class produces two objects or more then it is not a singleton pattern.

# Best practice Singleton pattern
* **BillPughSingleton** -> High perform
* **LazyInitalizedSingleton** -> Single thread
* **DoubleCheckLockingSingleton** -> Multi thread

