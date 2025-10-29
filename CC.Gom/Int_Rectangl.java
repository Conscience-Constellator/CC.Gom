package CC.Encycloped.Abs.Scal.Gom;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.Util.By.Get.Get_Int_By_Int;

public interface Int_Rectangl extends Bordr.Bordr_Int<Get_Int_By_Int>
{
	@Override @Nevr_Neds_Ovrid default int Dim_Num(){return 2;}

	@Override default int Min_Int(int Dim){return 0;}
	@Override default double Tax_Rad_Dubl(){return LNg_Int(0)+LNg_Int(1);}
	@Override default double Hyp_Rad_Dubl(){return CC.Encycloped.Abs.Scal.Gom.D2.Int.Gom.Hyp_Rad(LNg_Int(0),LNg_Int(1));}
	@Override default boolean In(Get_Int_By_Int Vectr)
	{
//		out.println("In");

		return In_Box(Vectr);
	}
	@Override default boolean In(Bordr<Get_Int_By_Int> Bordr){return In_Box(Bordr);}
}