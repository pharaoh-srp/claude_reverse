package defpackage;

import android.net.Uri;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class uhg extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ whg G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uhg(whg whgVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = whgVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        whg whgVar = this.G;
        switch (i) {
            case 0:
                uhg uhgVar = new uhg(whgVar, tp4Var, 0);
                uhgVar.F = obj;
                return uhgVar;
            default:
                uhg uhgVar2 = new uhg(whgVar, tp4Var, 1);
                uhgVar2.F = obj;
                return uhgVar2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
            case 0:
                ((uhg) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                return ieiVar;
            default:
                return ((uhg) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        tp4 tp4Var = null;
        switch (this.E) {
            case 0:
                l45 l45Var = (l45) this.F;
                sf5.h0(obj);
                whg whgVar = this.G;
                whgVar.l.setValue(gb9.D(l45Var, null, null, new bff(whgVar, tp4Var, 6), 3));
                return iei.a;
            default:
                l45 l45Var2 = (l45) this.F;
                sf5.h0(obj);
                whg whgVar2 = this.G;
                h86 h86Var = whgVar2.f;
                y31 y31Var = whgVar2.c;
                if (Build.VERSION.SDK_INT < 29) {
                    sz6.j("No supported encoders");
                    return null;
                }
                m6b m6bVarC = cm4.c(y31Var.a, y31.b);
                String code = whgVar2.e.c(whgVar2.d.f()).getCode();
                b0f b0fVar = (b0f) whgVar2.a.getValue();
                m6bVarC.e();
                r41.E.getClass();
                m6bVarC.e();
                m6bVarC.e();
                b0fVar.getClass();
                code.getClass();
                a0f a0fVar = new a0f(b0fVar.c, b0fVar.d);
                gdc gdcVarB = b0fVar.a.b();
                lz1 lz1Var = uh6.F;
                gdcVarB.c(0L);
                hdc hdcVar = new hdc(gdcVarB);
                Uri uriBuild = Uri.parse(b0fVar.b.concat("ws/speech_to_text/voice_stream")).buildUpon().appendQueryParameter("encoding", "opus").appendQueryParameter("sample_rate", String.valueOf(16000)).appendQueryParameter("channels", String.valueOf(1)).appendQueryParameter("language", code).appendQueryParameter("forward_interims", "typed").build();
                uriBuild.getClass();
                String string = uriBuild.toString();
                string.getClass();
                jie jieVar = new jie();
                jieVar.g(string);
                a0fVar.f = hdcVar.c(new kie(jieVar), a0fVar);
                whgVar2.o = a0fVar;
                tp4 tp4Var2 = null;
                fkg fkgVarD = gb9.D(l45Var2, null, null, new ba9(m6bVarC, tp4Var2, 27), 3);
                whgVar2.m.setValue(gb9.D(l45Var2, h86Var.getDefault(), null, new ba9(whgVar2, m6bVarC, tp4Var2, 26), 2));
                return gb9.D(l45Var2, h86Var.getDefault(), null, new ky0(a0fVar, whgVar2, fkgVarD, gb9.D(l45Var2, h86Var.b(), null, new lza(m6bVarC, whgVar2, a0fVar, tp4Var2, 17), 2), null), 2);
        }
    }
}
