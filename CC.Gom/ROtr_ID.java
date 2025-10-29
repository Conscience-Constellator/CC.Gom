package CC.Encycloped.Abs.Scal.Gom;

import CC.Math.Line;

public interface ROtr_ID extends ROtr
{
	boolean Has_Dim(Line Dim);
	double Rot_Dub(Line A,Line B);
	float Rot_Flot(Line A,Line B);
	void Set_Rot(Line A,Line B,float Rot);
	void Set_Rot(Line A,Line B,double Rot);
}