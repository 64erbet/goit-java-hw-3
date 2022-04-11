class ATM {
    public int countBanknotes(int sum) {
        int rez = 0;
      
        int kol_500 = (sum - (sum % 500))/500;
        sum = sum % 500;
      
        int kol_200 = (sum - (sum % 200))/200;
        sum = sum % 200;
      
        int kol_100 = (sum - (sum % 100))/100;
        sum = sum % 100;
      
        int kol_50 = (sum - (sum % 50))/50;
        sum = sum % 50;
      
        int kol_20 = (sum - (sum % 20))/20;
        sum = sum % 20;
      
        int kol_10 = (sum - (sum % 10))/10;
        sum = sum % 10;
      
        int kol_5 = (sum - (sum % 5))/5;
        sum = sum % 5;
      
        int kol_2 = (sum - (sum % 2))/2;
        sum = sum % 2;
      
        int kol_1 = (sum - (sum % 1))/1;
        sum = sum % 1;
      
        rez += kol_500 + kol_200 + kol_100 + kol_50 + kol_20 + kol_10 + kol_5 + kol_2 + kol_1;
      
        return (rez);
    }
}