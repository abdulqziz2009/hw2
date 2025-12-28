void main(List<String> args) {
  int age = 5;
  int temp = -21;

  if (age <= 5 && temp >= -20 || temp >= 45) {
    print('сиди дома');
  } else if (temp <= -20 || temp >= 10) {
    print('одеться теплее');
  } else {
    print('можно гулять');
  }
}
