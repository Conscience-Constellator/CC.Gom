package CC.Encycloped.Abs.Scal.Gom;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.Encycloped.Abs.Org.Syc.SNs.Sit.Cam_3D;
import CC.Encycloped.Abs.Org.Syc.SNs.Sit.Vis_Lim;
import CC.Encycloped.Tim.Updat_ContXt;
import CC.Encycloped.Tim.Updatbl;
import java.util.ArrayList;

public class Space<Vectr_Typ extends Vectr> implements Vectr_Typ_Havr<Vectr_Typ>,Updatbl, SpAc_Prt
{
	public static Clas_Rap Class=Init_StRt(Space.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public Space(Vis_Lim Draw){Set_Draw(Draw);}
		public Space(){/*this(new Point(0))*/;}
	public Space(Updat_ContXt ContXt,Vis_Lim Draw)
	{
		this(Draw);
		Set_ContXt(ContXt);
	}

	public Updat_ContXt ContXt;
		public void Set_ContXt(Updat_ContXt ContXt){this.ContXt=ContXt;}
		public Updat_ContXt ContXt(){return ContXt;}

	public Bordr Bordr;
		public Bordr Bordr(){return Bordr;}
		public void Set_Bordr(Bordr Bordr){this.Bordr=Bordr;}

	public Vis_Lim Draw;
		public Vis_Lim Draw(){return Draw;}
		public void Set_Draw(Vis_Lim Draw){this.Draw=Draw;}
	public ArrayList<Cam_3D> Camg=new ArrayList<>();
		public void Ad_Cam(Cam_3D Cam)
		{
			Camg.add(Cam);
			Cam.Set_Spac(this);
		}
		public Cam_3D Cam(int IndX){return Camg.get(IndX);}

	public long Last_Updatd;
		@Override public void Update(){}

	static{Init_Nd(Space.class);}
}