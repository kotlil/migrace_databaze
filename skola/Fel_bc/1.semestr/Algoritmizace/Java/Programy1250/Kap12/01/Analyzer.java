/*
   Soubor Kap12\01\Analyzer.java
   Op�t po��t�n� slov v textov�m souboru,
   ov�em tentokr�t s pomoc� vlastn� implementace 
   jednosm�rn� z�et�zen�ho seznamu zalo�en�ho 
   na parametrizovan�ch t��d�ch.
   Pou�it� stejn� jako v p�edchoz�ch p��padech.
   Vhodn� pro JDK 5 a vy���
*/

/** Prvek seznamu jako parametrizovan� t��da*/
class Prvek<T>
{
  T data = null;             // data ulo�en� v prvku
  int pocet = 0;             // po�et v�skyt�
  Prvek<T> dalsi = null;     // Odkaz na dal�� prvek seznamu
  Prvek(){}                  // Konstruktory
  Prvek(T s) {data = s; pocet = 1;}
  int obsahuje(T s) {return s.equals(data) ? pocet : 0;}
  void setDalsi(Prvek<T> q){dalsi = q;}
  Prvek<T> getDalsi(){return dalsi;}
  T getData(){return data;}
  void zvetsiPocet(){pocet++;}
  int getPocet(){return pocet;}
}

/** Vlastn� implementace seznamu jako parametrizovan� t��dy */
class Seznam<T>
{
  Prvek<T> hlava = null;
  void pridej(T data)
  {
    if(hlava == null)
    {
      hlava = new Prvek<T>(data);
    }
    else
    {
       Prvek<T> p = hlava, q = null;
       while(p != null)
       {
          if(p.obsahuje(data) > 0)
          {
            p.zvetsiPocet();
            return;
          }
          else
          {
            q = p;
            p = p.getDalsi();
          } // Konec if
       }    // konec while
       q.setDalsi(new Prvek<T>(data));
    }
  }

  void vypis()
  {
     Prvek<T> p = hlava;
     while(p != null)
     {
       System.out.println(p.getData()+ " " + p.getPocet());
       p = p.getDalsi();
     }
  }
  
  void vyprazdni()
  {
	hlava = null;
  }

}

public class Analyzer
{
  static String oddelovace = " .,;!?";

  int preskocOddelovace(String rad, int od) // rad: analyzovan� ��dek, od: index, od kter�ho se m� za��t
  {					    // Vrac�: index, kde za��n� n�sleduj�c� slovo, nebo -1, jsme-li na konci ��dku	
    if(od >= rad.length()) return -1;       // Jsme-li na konci ��dku, vra� -1
    while(oddelovace.indexOf(rad.charAt(od))>=0)
    {
     if(++od == rad.length()) return -1;
    }
    return od;
  }



  void analyzuj(String radek, Seznam<String> sezn) // radek: analyzovan� ��dek, sezn: Kontejner, do kterho se maj�� slova ukl�dat
  {
    if(radek.equals(""))return;		// Pr�zdn� ��dek n�s nezaj�m�
    int i = 0;				// Index znaku v ��dku
    StringBuffer data = null;		// Sem ulo��me z�skan� data
    i = preskocOddelovace(radek, i);	// Najdi za��tek dal��ho slova (-1 == konec ��dku)
    while(i >= 0)
    {
      data = new StringBuffer("");
      // P�enes n�sleduj�c� data do instance "data"
      while((i < radek.length()) && (oddelovace.indexOf(radek.charAt(i))==-1)) // Dokud to nen� odd�lova�
      {
        data.append(radek.charAt(i++));
      }
      // Ulo� data do slovn�ku
      String s = new String(data);
      sezn.pridej(s);
      i = preskocOddelovace(radek, i);
    }
  }


  void beh() throws Exception		// Vlastn� b�h programu
  {
    	Seznam<String> slovnik = new Seznam<String>();
        String radek = MojeIO.inStr();	// P�e�ti 1. ��dek

        while(radek != null)		// Dokud se �ten� da��
        {
          radek = radek.trim();		// Odstra� okrajov� mezery
          analyzuj(radek, slovnik);
	  radek = MojeIO.inStr();	// �ti dal�� ��dek
        }
        slovnik.vypis();    // Vypi� v�sledek

  }

  public static void main(String[] s) throws Exception
  { // Vytvo�� instanci t��dy Analyzer a spust� pro ni metodu beh()
      Analyzer a = new Analyzer();
      a.beh();
  }
}