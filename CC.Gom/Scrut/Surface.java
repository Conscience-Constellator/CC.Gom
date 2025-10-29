package CC.Encycloped.Abs.Scal.Gom.Scrut;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import java.awt.image.BufferedImage;

public class Surface extends BufferedImage
{
	public static final Clas_Rap Class=Init_StRt(Surface.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public Surface(int A_Lng,int B_Lng,int Imag_Typ){super(A_Lng,B_Lng,Imag_Typ);}

	static{Init_Nd(Surface.class);}
}