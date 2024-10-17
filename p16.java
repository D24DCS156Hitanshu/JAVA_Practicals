class complex{
    public static void main(String[] args) {
        complex c1=new complex(1,4);
        complex c2=new complex(2,1);

        complex sum=c1.sum(c2);
        System.out.println("real->"+sum.real + "imginary"+sum.img);


        complex diff=c1.diff(c2);
        System.out.println("real->"+diff.real + "imginary"+diff.img);

        complex mul=c1.mul(c2);
        System.out.println("real->"+mul.real + "imginary"+mul.img);

        complex div=c1.div(c2);
        System.out.println("real->"+div.real + "imginary"+div.img);

    }

    int real;
    int img;


    public complex(int real, int img) {
        this.real = real;
        this.img = img;
    }

    complex sum(complex otherno){
        return new complex(this.real+otherno.real,this.img+otherno.img);
    }
    complex diff(complex otherno){
        return new complex(this.real-otherno.real,this.img-otherno.img);
    }

    complex mul(complex otherno){
        return new complex(this.real*otherno.real,this.img*otherno.img);
    }

    complex div(complex otherno){
        return new complex(this.real/otherno.real,this.img/otherno.img);
    }
}