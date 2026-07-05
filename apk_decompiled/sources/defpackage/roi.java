package defpackage;

import android.content.Context;
import com.anthropic.claude.tool.model.UserTimeV0Output;
import java.time.OffsetDateTime;

/* JADX INFO: loaded from: classes.dex */
public final class roi implements lp3, pek {
    public final /* synthetic */ int E;

    public /* synthetic */ roi(int i) {
        this.E = i;
    }

    @Override // defpackage.lp3
    public Object w(Context context, Object obj, String str, cxh cxhVar) {
        OffsetDateTime offsetDateTimeNow = OffsetDateTime.now();
        offsetDateTimeNow.getClass();
        return pyk.E0(new UserTimeV0Output(offsetDateTimeNow));
    }

    @Override // defpackage.pek
    public Object zza() {
        switch (this.E) {
            case 2:
                b4l.F.get();
                Boolean bool = (Boolean) d4l.e.a();
                bool.getClass();
                return bool;
            case 3:
                b4l.F.get();
                Boolean bool2 = (Boolean) d4l.b.a();
                bool2.getClass();
                return bool2;
            case 4:
                b2l.F.get();
                Boolean bool3 = (Boolean) d2l.a.a();
                bool3.getClass();
                return bool3;
            case 5:
                k1l.F.get();
                return Integer.valueOf((int) ((Long) m1l.p.a()).longValue());
            case 6:
                k1l.F.get();
                Long l = (Long) m1l.v.a();
                l.getClass();
                return l;
            case 7:
                k1l.F.get();
                Long l2 = (Long) m1l.k.a();
                l2.getClass();
                return l2;
            case 8:
                x3l.F.get();
                Double d = (Double) z3l.c.a();
                d.getClass();
                return d;
            case 9:
                k1l.F.get();
                return (String) m1l.I.a();
            case 10:
                x1l.F.get();
                Boolean bool4 = (Boolean) z1l.c.a();
                bool4.getClass();
                return bool4;
            case 11:
                return Boolean.valueOf(q4l.a());
            case 12:
                i4l.F.get();
                Boolean bool5 = (Boolean) k4l.c.a();
                bool5.getClass();
                return bool5;
            default:
                k3l.F.get();
                Boolean bool6 = (Boolean) v3l.b.a();
                bool6.getClass();
                return bool6;
        }
    }
}
