#include <iostream>
#include <string>
#include <fstream>
using namespace std;

void mergeArrays(int x[], int y[], int a[], int s, int e)
{
    int mid = (s + e) / 2;
    int i = s;
    int j = mid + 1;
    int k = s;
    while (i <= mid && j <= e)
    {
        // We need to do the  Comparison
        if (x[i] < y[j])
        {
            a[k] = x[i];
            i++;
            k++;
        }
        else
        {
            a[k] = y[j];
            j++;
            k++;
        }
    }
    // Copy Rest of Elements
    while (i <= mid)
    {
        a[k] = x[i];
        k++;
        i++;
    }
    while (j <= e)
    {
        a[k] = y[j];
        k++;
        j++;
    }
}
void mergeSort(int a[], int s, int e)
{
    if (s >= e)
    {
        return;
    }
    int mid = (s + e) / 2;
    int x[100], y[100];
    for (int i = s; i <= mid; i++)
    {
        x[i] = a[i];
    }
    for (int i = mid + 1; i <= e; i++)
    {
        y[i] = a[i];
    }
    mergeSort(x, s, mid);
    mergeSort(y, mid + 1, e);
    mergeArrays(x, y, a, s, e);
}

struct Student
{
    string studentName;
    int age;
    int rollNum;
    double marks;
};

int main()
{
    struct Student arr_student[5];
    int i;

    for (i = 0; i < 5; i++)
    {
        cout << "Enter student name: ";
        cin >> arr_student[i].studentName;
        cout << "Enter student age: ";
        cin >> arr_student[i].age;
        while (arr_student[i].age > 30)
        {
            cout << "Age greater than 30 not allowed. re enter: ";
            cin >> arr_student[i].age;
        }

        cout << "Enter roll number: ";
        cin >> arr_student[i].rollNum;
        while (arr_student[i].rollNum < 0)
        {
            cout << "Only positive integers allowed. \n re enter: ";
            cin >> arr_student[i].rollNum;
        }

        cout << "Enter student marks: ";
        cin >> arr_student[i].marks;
        while (arr_student[i].marks <= 0 || arr_student[i].marks > 50)
        {
            cout << "The marks should be between 0 and 50. re-enter: ";
            cin >> arr_student[i].marks;
        }
    }
    cout << endl;

    fstream myFile;
    myFile.open("split.txt", ios::app);

    if (myFile.is_open())
    {
        for (i = 0; i < 5; i++)
        {
            myFile << arr_student[i].studentName << ", " << arr_student[i].age << ", " << arr_student[i].rollNum << ", " << arr_student[i].marks << endl;
        }
        myFile.close();
    }

    myFile.open("split.txt", ios::in);
    string myText;
    if (myFile.is_open())
    {
        while (getline(myFile, myText))
        {
            cout << myText << endl;
        }
        myFile.close();
    }
    cout << endl;
    cout << "[";

    int arr[5];

    for (i = 0; i < 5; i++)
    {
        arr[i] = arr_student[i].marks;
    }
    mergeSort(arr, 0, 4);
    cout << "Soterd marks: ";
    for (i = 0; i < 5; i++)
    {
        cout << arr[i] << " ";
    }

    cout << "]";

    return 0;
}