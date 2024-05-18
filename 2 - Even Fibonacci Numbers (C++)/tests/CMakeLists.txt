add_executable(tests_Fibonacci
			   ../src/Fibonacci/fibonacci.cpp  ../src/Fibonacci/fibonacci.hpp

			   ../../res/catch2/catch.hpp

			   test_main.cpp
	           "Fibonacci/test_Fibonacci.cpp"
)