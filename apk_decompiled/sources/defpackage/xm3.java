package defpackage;

import android.content.Context;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xm3 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ vm3 F;

    public /* synthetic */ xm3(vm3 vm3Var, int i) {
        this.E = i;
        this.F = vm3Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        vm3 vm3Var = this.F;
        ld4 ld4Var = (ld4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    ud0 ud0Var = ud0.d;
                    j50 j50Var = new j50(R.drawable.anthropicon_microphone);
                    String string = ((Context) e18Var.j(te4.b)).getString(R.string.claude_widget_voice_button);
                    e54 e54Var = new e54(new irh(((ni6) e18Var.j(te4.e)).l));
                    float f = vm3Var.d;
                    ytk.b(j50Var, string, new gaj(new n46(f)).d(new km8(new n46(f))), 0, e54Var, e18Var, FreeTypeConstants.FT_LOAD_NO_AUTOHINT, 8);
                }
                break;
            case 1:
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var2.T();
                } else {
                    q68 q68VarD = ovj.d(o68.a);
                    float f2 = vm3Var.b;
                    ctk.c(q68VarD.d(new jnc(new hnc(2, f2), new hnc(2, MTTypesetterKt.kLineSkipLimitMultiplier), new hnc(2, f2), new hnc(2, MTTypesetterKt.kLineSkipLimitMultiplier))), 1, fd9.q0(1615830421, new nn(11, vm3Var), e18Var2), e18Var2, 3072);
                }
                break;
            default:
                e18 e18Var3 = (e18) ld4Var;
                if (!e18Var3.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var3.T();
                } else {
                    ud0 ud0Var2 = ud0.d;
                    j50 j50Var2 = new j50(R.drawable.anthropicon_camera);
                    String string2 = ((Context) e18Var3.j(te4.b)).getString(R.string.claude_widget_camera_button);
                    e54 e54Var2 = new e54(new irh(((ni6) e18Var3.j(te4.e)).l));
                    float f3 = vm3Var.d;
                    ytk.b(j50Var2, string2, new gaj(new n46(f3)).d(new km8(new n46(f3))), 0, e54Var2, e18Var3, FreeTypeConstants.FT_LOAD_NO_AUTOHINT, 8);
                }
                break;
        }
        return ieiVar;
    }
}
