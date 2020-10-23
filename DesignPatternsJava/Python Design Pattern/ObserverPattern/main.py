import abc
import threading

class Observer(metaclass=abc.ABCMeta):

    @abc.abstractmethod
    def update(self):
        """Each observer implements it's own update method"""


class Reader(Observer):

    def update(self):
        print("Reading the data from the file")


class Writer(Observer):

    def update(self):
        print("Writing the data to the file")


class Subject(metaclass=abc.ABCMeta):

    @abc.abstractmethod
    def register(self, observer): pass

    @abc.abstractmethod
    def remove(self, observer): pass

    @abc.abstractmethod
    def notify(self): pass


class Observable(Subject):
    observable_list = []

    def register(self, observer):
        self.observable_list.append(observer)

    def remove(self, observer):
        self.observable_list.remove(observer)

    def notify(self):
        for obs in self.observable_list:
            obs.update()


if __name__ == '__main__':
    observable = Observable()

    # The reader is an observer
    reader = Reader()

    # The writer is an observer
    writer = Writer()

    # Reader registered to the service of the observable
    observable.register(reader)

    # Writer registered to the service of the observable
    observable.register(writer)

    # observable notified a read/write to the file and notify it's dependents
    observable.notify()

# See PyCharm help at https://www.jetbrains.com/help/pycharm/
