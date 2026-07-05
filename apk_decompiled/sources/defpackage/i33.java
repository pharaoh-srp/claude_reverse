package defpackage;

import android.content.SharedPreferences;
import com.anthropic.claude.types.strings.ModelId;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i33 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ t53 F;

    public /* synthetic */ i33(t53 t53Var, int i) {
        this.E = i;
        this.F = t53Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zy7
    public final Object a() {
        ihf ihfVarH;
        String noticeFingerprint;
        int i = this.E;
        char c = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        iei ieiVar = iei.a;
        t53 t53Var = this.F;
        switch (i) {
            case 0:
                return (fm3) t53Var.A0.getValue();
            case 1:
                return new cpc((Set) t53Var.u1.getValue(), Boolean.valueOf(t53Var.E.b()));
            case 2:
                r93 r93Var = t53Var.g0;
                String strE = r93Var.e();
                if (strE != null && (ihfVarH = r93Var.h()) != null && (noticeFingerprint = ihfVarH.a.getNoticeFingerprint()) != null) {
                    gob gobVar = t53Var.J;
                    gobVar.getClass();
                    int iHashCode = noticeFingerprint.hashCode();
                    SharedPreferences.Editor editorEdit = gobVar.a.edit();
                    editorEdit.putInt("notice_".concat(strE), iHashCode);
                    editorEdit.apply();
                    gobVar.d.put(ModelId.m1058boximpl(strE), Integer.valueOf(iHashCode));
                }
                return ieiVar;
            case 3:
                t53Var.U1.setValue(null);
                return ieiVar;
            case 4:
                t53Var.e1.setValue(Boolean.TRUE);
                return ieiVar;
            case 5:
                t53Var.s0();
                return ieiVar;
            case 6:
                if (t53Var.A0() != null) {
                    gb9.D(t53Var.a, null, null, new u43(t53Var, !r0.is_starred(), objArr == true ? 1 : 0, c == true ? 1 : 0), 3);
                }
                return ieiVar;
            case 7:
                t53Var.G1(null);
                return ieiVar;
            case 8:
                ftc ftcVar = (ftc) t53Var.f1.getValue();
                vwh vwhVarB = ftcVar != null ? ftcVar.b() : null;
                twh twhVar = vwhVarB instanceof twh ? (twh) vwhVarB : null;
                return Boolean.valueOf(twhVar != null && twhVar.a());
            case 9:
                gb9.D(t53Var.a, null, null, new b9(t53Var, objArr2 == true ? 1 : 0, 4), 3);
                return ieiVar;
            case 10:
                t53Var.s0();
                return ieiVar;
            case 11:
                return t53Var.U0();
            case 12:
                return Boolean.valueOf(t53Var.e1());
            default:
                return Boolean.valueOf(t53Var.I0());
        }
    }
}
