String digitalNumber(String[] lightStatus)
{
    String result="";
    String compare="";

    int len = lightStatus[0].length();

    for (int i=0;i<len;i=i+3) {
        for (int j=0; j<5 ; j++) {
                compare = compare + lightStatus[j].substring(i,i+3);
        }
        switch (compare) {
            case "****.**.**.****":
                result=result+"0";
                break;
            case  "..*..*..*..*..*":
                result=result+"1";
                break;
            case "***..*****..***":
                result=result+"2";
                break;
            case  "***..****..****":
                result=result+"3";
                break;
            case  "*.**.****..*..*":
                result=result+"4";
                break;
            case "****..***..****":
                result=result+"5";
                break;
            case   "****..****.****":
                result=result+"6";
                break;
            case    "***..*.**..*..*":
                result=result+"7";
                break;
            case    "****.*****.****":
                result=result+"8";
                break;
            case     "****.****..****":
                result=result+"9";
                break;
            default:
                System.out.println("wrong string");
        }
        compare = "";
    }
    return result;
}
