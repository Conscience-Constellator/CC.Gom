package CC.Encycloped.Abs.Scal.Gom;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import static CC.Math.Math_Plus.*;
import static java.lang.System.out;
import CC.Encycloped.Abs.Scal.Gom.D3.Spher_Abs;
import CC.Util.By.Get_Q_By_Q;
import CC.Util.By.Get.Get_Dubl_By_Int;
import CC.Util.By.Get.Get_Flot_By_Int;
import CC.Util.By.Get.Get_Int_By_Int;
import CC.Util.By.Get.Get_Long_By_Int;

/**An In that's limited in every direction.*/
public interface Bordr<Vectr_Typ extends Get_Q_By_Q> extends Inbl<Vectr_Typ>
{
	Clas_Rap Class=Init_StRt_Nd(Bordr.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Override default Inbl<Vectr_Typ> Bas_In(){return this;}

	int Min_Int(int Dim);
	long Min_Long(int Dim);
	float Min_Flot(int Dim);
	double Min_Dubl(int Dim);
	default int CNt_Int(int Dim){return Min_Int(Dim)+(LNg_Int(Dim)/2);}
	default long CNt_Long(int Dim){return Min_Long(Dim)+(LNg_Long(Dim)/2);}
	default float CNt_Flot(int Dim){return Min_Flot(Dim)+(LNg_Flot(Dim)/2);}
	default double CNt_Dubl(int Dim){return Min_Dubl(Dim)+(LNg_Dubl(Dim)/2);}
	int Max_Int(int Dim);
	long Max_Long(int Dim);
	float Max_Flot(int Dim);
	double Max_Dubl(int Dim);
	default int LNg_Int(int Dim){return UnsIn(Max_Int(Dim)-Min_Int(Dim));}
	default long LNg_Long(int Dim){return UnsIn(Max_Long(Dim)-Min_Long(Dim));}
	default float LNg_Flot(int Dim){return UnsIn(Max_Flot(Dim)-Min_Flot(Dim));}
	default double LNg_Dubl(int Dim){return UnsIn(Max_Dubl(Dim)-Min_Dubl(Dim));}
	default double Box_Rad_Dubl(){return Box_Rad_Dubl()/2;}
	default double Box_Diam_Dubl(){return 0//Lng_Dub()
			;}
	double Tax_Rad_Dubl();
	default double Tax_Diam_Dubl(){return Tax_Rad_Dubl()*2;}
	double Hyp_Rad_Dubl();
	default double Hyp_Diam_Dubl(){return Hyp_Rad_Dubl()*2;}
	default double Prox_Min(Vectr_Typ B){return 0;}
	default double Prox_CNt(Vectr_Typ B){return 0;}
	default double Prox_Max(Vectr_Typ B){return 0;}
	default double Prox_LNg(Vectr_Typ B){return 0;}

	default boolean In_Box(Vectr_Typ B)
	{
		for(int Dim=0;Dim<Dim_Num();Dim+=1)
		{
			if(!Betwen(((Get_Dubl_By_Int)B).Get_Dubl_By_Int(Dim),Min_Dubl(Dim),Max_Dubl(Dim)))
			{
				out.println("Out");
				return false;
			}
		}
		return true;
	}
	default boolean In_Box(Bordr<Vectr_Typ> B)
	{
		for(int Dim=0;Dim<Dim_Num();Dim+=1){if(Ovr(Min_Dubl(0),Max_Dubl(Dim),Min_Dubl(1),Max_Dubl(1))){return true;}}
		return false;
	}
	static void Ad_Spher(Bordr A,Bordr B,Spher_Abs.Sphere Ret)
	{
//		Vectr_3.Vectr_3_Dub Vector=Bet_CNt(A,B,2);
//		Ret.XtNd_Spher(A);
//		Ret.XtNd_Spher(B);
	}
//	static void Bet_CNt(D3_Dub_Bordr A,D3_Dub_Bordr B,double Div,Vectr_3_Dub.Vectr_3_Dub_Imp Ret){Bet(A.CNt(),A.CNt(),A.CNt(),B.CNt(),B.CNt(2),B.CNt(2),Div,Ret);}
//		static Vectr_3_Dub.Vectr_3_Dub_Imp Bet_CNt(D3_Dub_Bordr A,D3_Dub_Bordr B,double Div)
//		{
//			Vectr_3.Vectr_3_Dub Ret=new Vectr_3.Vectr_3_Dub();
//			Bet_CNt(A,B,Div,Ret);
//
//			return Ret;
//		}

	default boolean p(){return false;}

	interface Bordr_Int<Vectr_Typ extends Get_Int_By_Int> extends Bordr<Vectr_Typ>
	{
		@Override default long Min_Long(int Dim){return Min_Int(Dim);}
		@Override default float Min_Flot(int Dim){return Min_Int(Dim);}
		@Override default double Min_Dubl(int Dim){return Min_Int(Dim);}
		@Override default long Max_Long(int Dim){return Max_Int(Dim);}
		@Override default float Max_Flot(int Dim){return Max_Int(Dim);}
		@Override default double Max_Dubl(int Dim){return Max_Int(Dim);}
	}
	interface Bordr_Long<Vectr_Typ extends Get_Long_By_Int> extends Bordr<Vectr_Typ>
	{
		@Override default int Min_Int(int Dim){return (int)Min_Long(Dim);}
		@Override default float Min_Flot(int Dim){return Min_Long(Dim);}
		@Override default double Min_Dubl(int Dim){return Min_Long(Dim);}
		@Override default int Max_Int(int Dim){return (int)Max_Long(Dim);}
		@Override default float Max_Flot(int Dim){return Max_Long(Dim);}
		@Override default double Max_Dubl(int Dim){return Max_Long(Dim);}
	}
	interface Bordr_Flot<Vectr_Typ extends Get_Flot_By_Int> extends Bordr<Vectr_Typ>
	{
		@Override default int Min_Int(int Dim){return (int)Min_Flot(Dim);}
		@Override default long Min_Long(int Dim){return (long)Min_Flot(Dim);}
		@Override default double Min_Dubl(int Dim){return Min_Flot(Dim);}
		@Override default int Max_Int(int Dim){return (int)Max_Flot(Dim);}
		@Override default long Max_Long(int Dim){return (long)Max_Flot(Dim);}
		@Override default double Max_Dubl(int Dim){return Max_Flot(Dim);}
	}
	interface Bordr_Dubl<Vectr_Typ extends Get_Dubl_By_Int> extends Bordr<Vectr_Typ>
	{
		@Override default int Min_Int(int Dim){return (int)Min_Dubl(Dim);}
		@Override default long Min_Long(int Dim){return (long)Min_Dubl(Dim);}
		@Override default float Min_Flot(int Dim){return (float)Min_Dubl(Dim);}
		@Override default int Max_Int(int Dim){return (int)Max_Dubl(Dim);}
		@Override default long Max_Long(int Dim){return (long)Max_Dubl(Dim);}
		@Override default float Max_Flot(int Dim){return (float)Max_Dubl(Dim);}
	}
}