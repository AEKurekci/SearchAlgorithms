#include <iostream>
#include <queue>

using namespace std;

queue<int> myQueue;
int number;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	do{
		cout<<"Please enter some numbers(ended with 0)"<<endl;
		cin>>number;
		myQueue.push(number);
	}while(number);
	
	cout<<"Size of the queue is "<<myQueue.size()<<endl;
	while(!myQueue.empty()){
		cout<<' '<<myQueue.front();
		myQueue.pop();
	}
	cout<<endl<<"popped from front"<<endl;
	cout<<"Size of the queue is "<<myQueue.size()<<endl;
	return 0;
}
