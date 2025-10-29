package CC.Encycloped.Abs.Scal.Gom;

import CC.Util.By.Get.Get_Dubl_By_Int;
import CC.Util.By.Get.Get_Flot_By_Int;
import CC.Util.By.Get.Get_Int_By_Int;
import CC.Util.By.Get.Get_Long_By_Int;
import CC.Util.By.Get_Q_By_Q;
import CC.Util.By.LMNt.Get_Dubl_By_Q;

import static java.lang.StrictMath.max;
import static java.lang.StrictMath.min;

public class Triangl<Vectr_Typ extends Get_Q_By_Q>
		extends Vectr_Havr_3.Vectr_Setbl_3.Vectr_Setbl_3_Imp<Vectr_Typ>
		implements Bordr<Vectr_Typ>
{
	public Triangl(
			Vectr_Typ A,
			Vectr_Typ B,
			Vectr_Typ C
	){Set_Vectrg(A,B,C);}
	public Triangl(){}

	public Vectr_Typ A,B,C;
		public void Set_Vectrg(
				Vectr_Typ A,
				Vectr_Typ B,
				Vectr_Typ C)
		{
			this.A=A;
			this.B=B;
			this.C=C;
		}

	@Override public int Min_Int(int Dim){return min(min(((Get_Int_By_Int)Vectr_A).Get_Int_By_Int(Dim),((Get_Int_By_Int)Vectr_B).Get_Int_By_Int(Dim)),((Get_Int_By_Int)Vectr_C).Get_Int_By_Int(Dim));}
	@Override public long Min_Long(int Dim){return min(min(((Get_Long_By_Int)Vectr_A).Get_Long_By_Int(Dim),((Get_Long_By_Int)Vectr_B).Get_Long_By_Int(Dim)),((Get_Long_By_Int)Vectr_C).Get_Long_By_Int(Dim));}
	@Override public float Min_Flot(int Dim){return min(min(((Get_Flot_By_Int)Vectr_A).Get_Flot_By_Int(Dim),((Get_Flot_By_Int)Vectr_B).Get_Flot_By_Int(Dim)),((Get_Flot_By_Int)Vectr_C).Get_Flot_By_Int(Dim));}
	@Override public double Min_Dubl(int Dim){return min(min(((Get_Dubl_By_Int)Vectr_A).Get_Dubl_By_Int(Dim),((Get_Dubl_By_Int)Vectr_B).Get_Dubl_By_Int(Dim)),((Get_Dubl_By_Int)Vectr_C).Get_Dubl_By_Int(Dim));}
	@Override public int Max_Int(int Dim){return max(max(((Get_Int_By_Int)Vectr_A).Get_Int_By_Int(Dim),((Get_Int_By_Int)Vectr_B).Get_Int_By_Int(Dim)),((Get_Int_By_Int)Vectr_C).Get_Int_By_Int(Dim));}
	@Override public long Max_Long(int Dim){return max(max(((Get_Long_By_Int)Vectr_A).Get_Long_By_Int(Dim),((Get_Long_By_Int)Vectr_B).Get_Long_By_Int(Dim)),((Get_Long_By_Int)Vectr_C).Get_Long_By_Int(Dim));}
	@Override public float Max_Flot(int Dim){return max(max(((Get_Flot_By_Int)Vectr_A).Get_Flot_By_Int(Dim),((Get_Flot_By_Int)Vectr_B).Get_Flot_By_Int(Dim)),((Get_Flot_By_Int)Vectr_C).Get_Flot_By_Int(Dim));}
	@Override public double Max_Dubl(int Dim){return max(max(((Get_Dubl_By_Int)Vectr_A).Get_Dubl_By_Int(Dim),((Get_Dubl_By_Int)Vectr_B).Get_Dubl_By_Int(Dim)),((Get_Dubl_By_Int)Vectr_C).Get_Dubl_By_Int(Dim));}

	public double Tax_Rad_Dubl(Gom.Unsind_Adr Adr)
	{
		Adr.Valu=0;
		((Get_Dubl_By_Q)Vectr_A).Itr_Dubl(Adr);
		double A=Adr.$Dubl();
		Adr.Valu=0;
		((Get_Dubl_By_Q)Vectr_B).Itr_Dubl(Adr);
		double B=Adr.$Dubl();
		Adr.Valu=0;
		((Get_Dubl_By_Q)Vectr_C).Itr_Dubl(Adr);
		double C=Adr.$Dubl();

		return max(max(A,B),C);
	}
		@Override
		public double Tax_Rad_Dubl()
		{
			Gom.Unsind_Adr Adr=new Gom.Unsind_Adr();

			return Tax_Rad_Dubl(Adr);
		}
	public double Hyp_Rad_Dubl(Gom.Hyp_Adr Adr)
	{
		Adr.Valu=0;
		((Get_Dubl_By_Q)Vectr_A).Itr_Dubl(Adr);
		double A=Adr.$Dubl();
		Adr.Valu=0;
		((Get_Dubl_By_Q)Vectr_B).Itr_Dubl(Adr);
		double B=Adr.$Dubl();
		Adr.Valu=0;
		((Get_Dubl_By_Q)Vectr_C).Itr_Dubl(Adr);
		double C=Adr.$Dubl();

		return max(max(A,B),C);
	}
		@Override
		public double Hyp_Rad_Dubl()
		{
			Gom.Hyp_Adr Adr=new Gom.Hyp_Adr();

			return Hyp_Rad_Dubl(Adr);
		}
//	@Override default double Tax_Rad_Dub(){return Math_Plus.Max(Geom_3_Dub.Tax_Rad(Vectr_A()),Geom_3_Dub.Tax_Rad(Vec_B()),Geom_3_Dub.Tax_Rad(Vec_C()));}
//	@Override default double Hyp_Rad_Dub(){return Max(Geom_3_Dub.Hyp_Rad(Vectr_A()),Geom_3_Dub.Hyp_Rad(Vec_B()),Geom_3_Dub.Hyp_Rad(Vec_C()));}

	@Override public boolean In(Vectr_Typ B){return false;}
	@Override public boolean In(Bordr<Vectr_Typ> B){return false;}
}