package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.e;
import androidx.health.platform.client.proto.g;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.tool.model.EventDeleteV0Input;
import com.anthropic.claude.tool.model.MessageComposeV0Input;
import com.anthropic.claude.types.strings.MessageId;
import java.nio.charset.Charset;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Date;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class efe implements lp3, f7g, fe7, qc, bp1, oid, s7d, e49 {
    public final /* synthetic */ int E;
    public Object F;

    public efe(byte b, int i) {
        this.E = i;
        switch (i) {
            case 13:
                this.F = new ConcurrentHashMap(16);
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                this.F = Build.VERSION.SDK_INT >= 28 ? new ql8(25) : new am4(15);
                break;
            default:
                this.F = new j6(this);
                break;
        }
    }

    public static wz9 D(efe efeVar, int i) {
        x0a x0aVar = (x0a) efeVar.F;
        rcg rcgVarZ = fd9.Z();
        bz7 bz7VarE = rcgVarZ != null ? rcgVarZ.e() : null;
        rcg rcgVarK0 = fd9.k0(rcgVarZ);
        try {
            p0a p0aVar = (p0a) x0aVar.f.getValue();
            fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
            return x0aVar.q.a(i, p0aVar.j, x0aVar.d, new e69(i, p0aVar));
        } catch (Throwable th) {
            fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
            throw th;
        }
    }

    public static n78 f() {
        return new n78(4, new BitSet());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A(java.util.List r5) {
        /*
            r4 = this;
            r5.getClass()
            java.lang.Object r0 = r4.F
            uw1 r0 = (defpackage.uw1) r0
            r1 = 0
            if (r0 != 0) goto Lb
            goto L30
        Lb:
            r2 = 0
            r4.F = r2
            java.lang.Object r4 = defpackage.w44.V0(r5)
            whd r4 = (defpackage.whd) r4
            if (r4 == 0) goto L1a
            java.lang.String r2 = r4.c()
        L1a:
            java.lang.String r4 = r0.a()
            r3 = 1
            if (r2 != 0) goto L27
            if (r4 != 0) goto L25
            r4 = r3
            goto L2e
        L25:
            r4 = r1
            goto L2e
        L27:
            if (r4 != 0) goto L2a
            goto L25
        L2a:
            boolean r4 = com.anthropic.claude.types.strings.MessageId.m1054equalsimpl0(r2, r4)
        L2e:
            if (r4 != 0) goto L31
        L30:
            return r1
        L31:
            java.util.List r4 = r0.c()
            java.util.Collection r4 = (java.util.Collection) r4
            r5.addAll(r4)
            java.util.List r4 = r0.c()
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efe.A(java.util.List):boolean");
    }

    public void B(float f, long j) {
        fb2 fb2VarP = ((fj0) this.F).p();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        fb2VarP.n(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        fb2VarP.b(f);
        fb2VarP.n(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void C(long j, float f, float f2) {
        fb2 fb2VarP = ((fj0) this.F).p();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        fb2VarP.n(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        fb2VarP.a(f, f2);
        fb2VarP.n(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public synchronized boolean E(long j) {
        boolean zContains = ((SharedPreferences) this.F).contains("fire-global");
        SharedPreferences sharedPreferences = (SharedPreferences) this.F;
        if (!zContains) {
            sharedPreferences.edit().putLong("fire-global", j).commit();
            return true;
        }
        long j2 = sharedPreferences.getLong("fire-global", -1L);
        synchronized (this) {
            if (t(j2).equals(t(j))) {
                return false;
            }
            ((SharedPreferences) this.F).edit().putLong("fire-global", j).commit();
            return true;
        }
    }

    public synchronized void F(long j, String str) {
        String strT = t(j);
        if (((SharedPreferences) this.F).getString("last-used-date", "").equals(strT)) {
            String strU = u(strT);
            if (strU == null) {
                return;
            }
            if (strU.equals(str)) {
                return;
            }
            H(str, strT);
            return;
        }
        long j2 = ((SharedPreferences) this.F).getLong("fire-count", 0L);
        if (j2 + 1 == 30) {
            i();
            j2 = ((SharedPreferences) this.F).getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(((SharedPreferences) this.F).getStringSet(str, new HashSet()));
        hashSet.add(strT);
        ((SharedPreferences) this.F).edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", strT).commit();
    }

    public void G(float f, float f2) {
        ((fj0) this.F).p().n(f, f2);
    }

    public synchronized void H(String str, String str2) {
        z(str2);
        HashSet hashSet = new HashSet(((SharedPreferences) this.F).getStringSet(str, new HashSet()));
        hashSet.add(str2);
        ((SharedPreferences) this.F).edit().putStringSet(str, hashSet).commit();
    }

    public void I(int i, Object obj, g7f g7fVar) {
        a aVar = (a) obj;
        e eVar = (e) this.F;
        eVar.A(i, 2);
        eVar.C(aVar.a(g7fVar));
        g7fVar.g(this, aVar);
    }

    @Override // defpackage.s7d
    public long a(float f, float f2) {
        long jB = nwa.b((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), (float[]) this.F);
        return so7.a(Float.intBitsToFloat((int) (jB >> 32)), Float.intBitsToFloat((int) (jB & 4294967295L)));
    }

    public void b(int i, i6 i6Var, String str, Bundle bundle) {
    }

    @Override // defpackage.e49
    public boolean c(ax5 ax5Var, int i, Bundle bundle) {
        omg omgVar = (omg) this.F;
        if ((i & 1) != 0) {
            try {
                ax5Var.E();
                InputContentInfo inputContentInfo = (InputContentInfo) ((ro6) ax5Var.F).F;
                inputContentInfo.getClass();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("EXTRA_INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e) {
                e.toString();
                return false;
            }
        }
        p60 p60Var = omgVar.a;
        o5l o5lVarK = x2k.k(ax5Var, bundle);
        if (((mi6) p60Var.K) != null) {
            return !x44.r(r2.b.a(o5lVarK), o5lVarK);
        }
        return false;
    }

    @Override // defpackage.bp1
    public void d(hp1 hp1Var) {
        hp1Var.getClass();
        amg amgVar = ((m98) this.F).n;
        Boolean boolValueOf = Boolean.valueOf(hp1Var.a == 0);
        amgVar.getClass();
        amgVar.n(null, boolValueOf);
    }

    @Override // defpackage.qc
    public void e(Object obj) {
        pc pcVar = (pc) obj;
        rx7 rx7Var = (rx7) this.F;
        nx7 nx7Var = (nx7) rx7Var.F.pollLast();
        if (nx7Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = nx7Var.E;
        int i = nx7Var.F;
        cx7 cx7VarE = rx7Var.c.E(str);
        if (cx7VarE != null) {
            cx7VarE.t(i, pcVar.E, pcVar.F);
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }

    @Override // defpackage.bp1
    public void g() {
        amg amgVar = ((m98) this.F).n;
        Boolean bool = Boolean.FALSE;
        amgVar.getClass();
        amgVar.n(null, bool);
    }

    @Override // defpackage.ivd
    public Object get() {
        String packageName = ((Context) ((ivd) this.F).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        mr9.h("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }

    public void h(List list, int i, cw7 cw7Var) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return;
        }
        whd whdVar = (whd) w44.O0(i - 1, list);
        String strC = whdVar != null ? whdVar.c() : null;
        List listP1 = w44.p1(list.subList(i, list.size()));
        ArrayList arrayList = new ArrayList();
        boolean zM1054equalsimpl0 = false;
        int i2 = 0;
        for (Object obj : listP1) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                x44.n0();
                throw null;
            }
            whd whdVar2 = (whd) obj;
            if (!t9e.r(whdVar2) && (!(whdVar2 instanceof vhd) || !((vhd) whdVar2).b() || !t9e.r((whd) w44.O0(i3, listP1)))) {
                arrayList.add(obj);
            }
            i2 = i3;
        }
        if (!arrayList.isEmpty()) {
            this.F = new uw1(arrayList, cw7Var, strC);
            return;
        }
        uw1 uw1Var = (uw1) this.F;
        String strA = uw1Var != null ? uw1Var.a() : null;
        if (strA == null) {
            if (strC == null) {
                zM1054equalsimpl0 = true;
            }
        } else if (strC != null) {
            zM1054equalsimpl0 = MessageId.m1054equalsimpl0(strA, strC);
        }
        if (zM1054equalsimpl0) {
            return;
        }
        this.F = null;
    }

    public synchronized void i() {
        try {
            long j = ((SharedPreferences) this.F).getLong("fire-count", 0L);
            String key = "";
            String str = null;
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.F).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str2 : (Set) entry.getValue()) {
                        if (str == null || str.compareTo(str2) > 0) {
                            key = entry.getKey();
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet(((SharedPreferences) this.F).getStringSet(key, new HashSet()));
            hashSet.remove(str);
            ((SharedPreferences) this.F).edit().putStringSet(key, hashSet).putLong("fire-count", j - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void j(c40 c40Var) {
        ((fj0) this.F).p().l(c40Var);
    }

    public void k(float f, float f2, float f3, float f4, int i) {
        ((fj0) this.F).p().m(f, f2, f3, f4, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(defpackage.sh2 r5, defpackage.vp4 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.jbc
            if (r0 == 0) goto L13
            r0 = r6
            jbc r0 = (defpackage.jbc) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            jbc r0 = new jbc
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return
        L27:
            kotlin.KotlinNothingValueException r4 = defpackage.sq6.y(r6)
            throw r4
        L2c:
            defpackage.sf5.h0(r6)
            java.lang.Object r4 = r4.F
            amg r4 = (defpackage.amg) r4
            r0.G = r2
            r4.a(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efe.l(sh2, vp4):void");
    }

    @Override // defpackage.f7g
    public void lock() {
        ((ReentrantLock) this.F).lock();
    }

    public i6 m(int i) {
        return null;
    }

    @Override // defpackage.oid
    public void n(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.F).setResultCode(i);
    }

    public synchronized void o() {
        try {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) this.F).edit();
            int i = 0;
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.F).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String strT = t(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(strT)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(strT);
                        i++;
                        editorEdit.putStringSet(key, hashSet);
                    } else {
                        editorEdit.remove(key);
                    }
                }
            }
            if (i == 0) {
                editorEdit.remove("fire-count");
            } else {
                editorEdit.putLong("fire-count", i);
            }
            editorEdit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        if (r6 == r5) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(com.anthropic.claude.tool.model.EventDeleteV0Input r7, defpackage.vp4 r8) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efe.p(com.anthropic.claude.tool.model.EventDeleteV0Input, vp4):java.lang.Object");
    }

    public i6 q(int i) {
        return null;
    }

    public synchronized ArrayList r() {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.F).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(t(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(q81.a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                ((SharedPreferences) this.F).edit().putLong("fire-global", jCurrentTimeMillis).commit();
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public wlg s() {
        gl6 gl6VarA = gl6.a();
        if (gl6VarA.c() == 1) {
            return new az8(true);
        }
        lsc lscVarP = mpk.P(Boolean.FALSE);
        gl6VarA.h(new sr5(lscVarP, this));
        return lscVarP;
    }

    public synchronized String t(long j) {
        return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public synchronized String u(String str) {
        for (Map.Entry<String, ?> entry : ((SharedPreferences) this.F).getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.f7g
    public void unlock() {
        ((ReentrantLock) this.F).unlock();
    }

    public void v(float f, float f2, float f3, float f4) {
        fj0 fj0Var = (fj0) this.F;
        fb2 fb2VarP = fj0Var.p();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fj0Var.w() >> 32)) - (f3 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fj0Var.w() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < MTTypesetterKt.kLineSkipLimitMultiplier || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < MTTypesetterKt.kLineSkipLimitMultiplier) {
            a39.a("Width and height must be greater than or equal to zero");
        }
        fj0Var.N(jFloatToRawIntBits);
        fb2VarP.n(f, f2);
    }

    @Override // defpackage.lp3
    public Object w(Context context, Object obj, String str, cxh cxhVar) {
        switch (this.E) {
            case 6:
                return p((EventDeleteV0Input) obj, cxhVar);
            default:
                ((lfb) this.F).g = ((MessageComposeV0Input) obj).getKind();
                return pyk.E0("Text message creation template has been presented.");
        }
    }

    public n78 x() {
        return new n78(4, (BitSet) ((BitSet) this.F).clone());
    }

    public boolean y(int i, int i2, Bundle bundle) {
        return false;
    }

    public synchronized void z(String str) {
        try {
            String strU = u(str);
            if (strU == null) {
                return;
            }
            HashSet hashSet = new HashSet(((SharedPreferences) this.F).getStringSet(strU, new HashSet()));
            hashSet.remove(str);
            boolean zIsEmpty = hashSet.isEmpty();
            SharedPreferences sharedPreferences = (SharedPreferences) this.F;
            if (zIsEmpty) {
                sharedPreferences.edit().remove(strU).commit();
            } else {
                sharedPreferences.edit().putStringSet(strU, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public /* synthetic */ efe(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    public efe(Set set) {
        this.E = 0;
        this.F = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            dfe dfeVar = (dfe) it.next();
            HashMap map = (HashMap) this.F;
            dfeVar.getClass();
            map.put(fe5.class, dfeVar.a);
        }
    }

    public efe(n78 n78Var) {
        this.E = 4;
        this.F = (BitSet) n78Var.F;
    }

    public efe(is8 is8Var, EnumMap enumMap) {
        this.E = 10;
        this.F = is8Var;
    }

    public efe(e eVar) {
        this.E = 8;
        Charset charset = w89.a;
        this.F = eVar;
        eVar.a = this;
    }

    public efe(View view) {
        this.E = 27;
        if (Build.VERSION.SDK_INT >= 30) {
            deg degVar = new deg(28, view);
            degVar.L = view;
            this.F = degVar;
            return;
        }
        this.F = new n78(28, view);
    }

    public efe(Context context, String str) {
        this.E = 17;
        this.F = context.getSharedPreferences("FirebaseHeartBeat".concat(str), 0);
    }

    public /* synthetic */ efe(int i, char c) {
        this.E = i;
    }

    public efe(int i) {
        this.E = 21;
        this.F = bmg.a(new int[i]);
    }
}
