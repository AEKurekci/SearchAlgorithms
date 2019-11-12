#include <iostream>
#include <stack>

using namespace std;
int main(int argc, char** argv) {
	
	stack<int> myStack;
	
	for(int i = 0; i < 5; ++i){
		myStack.push(i);
	}
	cout<<"Pushing all elements"<<endl;
	cout<<"Size of the stack is "<<myStack.size()<<endl;
	cout<<"Popping all element"<<endl;
	while(!myStack.empty()){
		cout<<' '<<myStack.top();
		myStack.pop();
	}
	cout<<endl;
	cout<<"Size of the stack is "<<myStack.size()<<endl;
	return 0;
}
