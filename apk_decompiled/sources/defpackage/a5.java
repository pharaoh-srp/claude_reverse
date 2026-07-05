package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.tool.model.AlarmCreateV0Input;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a5 implements j20, b45, ore, fdg, ia4, lp3, c22, i29, bt9, jki {
    public static final a5 F = new a5(1);
    public static final /* synthetic */ a5 G = new a5(2);
    public static final a5 H = new a5(3);
    public static final a5 I = new a5(4);
    public static final a5 J = new a5(5);
    public static final /* synthetic */ a5 K = new a5(6);
    public static final xpc L = new xpc();
    public static final a5 M = new a5(8);
    public static final a5 N = new a5(9);
    public static final a5 O = new a5(10);
    public static final /* synthetic */ a5 P = new a5(11);
    public final /* synthetic */ int E;

    public /* synthetic */ a5(int i) {
        this.E = i;
    }

    @Override // defpackage.i29
    public c29 a() {
        return new nh1(null, null);
    }

    @Override // defpackage.c22
    public byte[] b(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // defpackage.i29
    public void c() {
    }

    @Override // defpackage.bt9
    public boolean d(bfd bfdVar) {
        return false;
    }

    @Override // defpackage.j20
    public Object e(Context context, k20 k20Var) {
        throw new UnsupportedOperationException("All preloaded fonts are blocking.");
    }

    public boolean equals(Object obj) {
        switch (this.E) {
            case 0:
                if (this == obj) {
                    return true;
                }
                return a5.class.equals(obj != null ? obj.getClass() : null);
            default:
                return super.equals(obj);
        }
    }

    public yr9 f(ud9 ud9Var, c92 c92Var, boolean z, el5 el5Var, nc0 nc0Var, cai caiVar, boolean z2, bz7 bz7Var) {
        t6g t6gVar = new t6g(c92Var, z, el5Var, nc0Var);
        yr9 yr9Var = (yr9) bz7Var.invoke(ud9Var);
        Collection collectionI = ud9Var.i();
        collectionI.getClass();
        Collection<e92> collection = collectionI;
        ArrayList arrayList = new ArrayList(x44.y(collection, 10));
        for (e92 e92Var : collection) {
            e92Var.getClass();
            arrayList.add((yr9) bz7Var.invoke(e92Var));
        }
        return ql8.p(yr9Var.k0(), t6gVar.a(yr9Var, arrayList, caiVar, z2), 0, t6gVar.e()).l();
    }

    @Override // defpackage.jki
    public void g() {
    }

    @Override // defpackage.j20
    public Typeface h(Context context, k20 k20Var) {
        dz dzVar = k20Var instanceof dz ? (dz) k20Var : null;
        if (dzVar == null) {
            return null;
        }
        if (!dzVar.f && dzVar.g == null) {
            dzVar.g = dzVar.c(context);
        }
        dzVar.f = true;
        return dzVar.g;
    }

    public int hashCode() {
        switch (this.E) {
            case 0:
                return a5.class.hashCode();
            default:
                return super.hashCode();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0261 A[EDGE_INSN: B:121:0x0261->B:122:0x026d BREAK  A[LOOP:4: B:115:0x0245->B:174:?]] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ee  */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [c92] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r21v0, types: [a5] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [bo5, e92] */
    /* JADX WARN: Type inference failed for: r5v6, types: [ud9] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r9v3, types: [c92] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList i(defpackage.el5 r22, java.util.Collection r23) {
        /*
            Method dump skipped, instruction units count: 757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a5.i(el5, java.util.Collection):java.util.ArrayList");
    }

    @Override // defpackage.jki
    public void m() {
    }

    @Override // defpackage.fdg
    public boolean q(Object obj, Object obj2) {
        return x44.r(obj, obj2);
    }

    @Override // defpackage.ia4
    public Object s(el5 el5Var) {
        return new efe(el5Var.d(qzd.a(dfe.class)));
    }

    public String toString() {
        switch (this.E) {
            case 9:
                return "StructuralEqualityPolicy";
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.lp3
    public Object w(Context context, Object obj, String str, cxh cxhVar) {
        AlarmCreateV0Input alarmCreateV0Input = (AlarmCreateV0Input) obj;
        Intent intent = new Intent("android.intent.action.SET_ALARM");
        intent.setFlags(268435456);
        intent.putExtra("android.intent.extra.alarm.HOUR", alarmCreateV0Input.getHour());
        intent.putExtra("android.intent.extra.alarm.MINUTES", alarmCreateV0Input.getMinute());
        intent.putExtra("android.intent.extra.alarm.MESSAGE", alarmCreateV0Input.getMessage());
        Boolean vibrate = alarmCreateV0Input.getVibrate();
        if (vibrate != null) {
            intent.putExtra("android.intent.extra.alarm.VIBRATE", vibrate.booleanValue());
        }
        List<Integer> days = alarmCreateV0Input.getDays();
        if (days != null) {
            intent.putExtra("android.intent.extra.alarm.DAYS", w44.o1(days));
        }
        intent.putExtra("android.intent.extra.alarm.SKIP_UI", true);
        try {
            context.startActivity(intent);
            return pyk.E0("Alarm was set on Android device.");
        } catch (Throwable th) {
            zfa.a.getClass();
            if (yfa.b()) {
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj2)).getClass();
                    arrayList.add(obj2);
                }
                if (!arrayList.isEmpty()) {
                    String strS = sq6.s(zfa.a, th, "Failed to set alarm: ");
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((n30) ((zfa) it.next())).b(sfa.ERROR, "AlarmCreatorTool", strS);
                    }
                }
            }
            return pyk.z0("Failed to set alarm.");
        }
    }
}
