#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
struct node{
	int data;
	struct node* left;
	struct node* right;
};

struct node* newNode(int idata){
	struct node* node = new struct node;
	node->data = idata;
	node->left = NULL;
	node->right = NULL;
	return node;
}
struct node* newNode(int idata, int left){
	struct node* node = new struct node;
	node->data = idata;
	node->left = newNode(left);
	node->right = NULL;
	return node;
}
struct node* newNode(int idata, int left, int right){
	struct node* node = new struct node;
	node->data = idata;
	node->left = newNode(left);
	node->right = newNode(right);
	return node;
}

int main() {
	struct node *root = newNode(5, 3, 8);
	cout<<root->left->data<<endl;
	cout<<root->data<<endl;
	cout<<root->right->data;	
	return 0;
}
