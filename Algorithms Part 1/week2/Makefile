JUNIT = $(JUNIT_HOME)/junit-4.12.jar
HAMCREST = $(JUNIT_HOME)/hamcrest-core-1.3.jar
TESTS = FixedCapacityStackOfStringsTest LinkedListQueueTest ResizingArrayStackOfStringsTest  \
		LinkedStackOfStringsTest ClassRosterTest SortableDateTest VariousSortTest

compile:
	javac -cp .:$(JUNIT) *.java

test: compile
	java -cp .:$(JUNIT):$(HAMCREST) org.junit.runner.JUnitCore $(TESTS)