add_executable(tests_Fibonacci
			   ../src/Fibonacci/fibonacci.cpp  ../src/Fibonacci/fibonacci.hpp
			   ../src/MathOperation/EvenNumberInList.cpp  ../src/MathOperation/EvenNumberInList.hpp
			   ../src/MathOperation/SumNumberInList.cpp  ../src/MathOperation/SumNumberInList.hpp

			   ../../res/catch2/catch.hpp

			   "test_main.cpp"
	           "Fibonacci/test_Fibonacci.cpp"
			   "MathOperation/test_EvenNumberInList.cpp" "MathOperation/test_SumNumberInList.cpp"
			   "MathOperation/test_SumNumberInList.cpp" "MathOperation/test_SumNumberInList.cpp"

)