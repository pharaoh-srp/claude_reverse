package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.core.view.ScrollingView;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.tool.model.EventUpdateV0Input;
import com.anthropic.claude.types.strings.ProjectId;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class gmf implements sb, lp3, a03, lye, fe7, szb, vg3, qc, ore, ro7 {
    public static final c28 G = new c28(1);
    public final /* synthetic */ int E;
    public Object F;

    public gmf(int i) {
        ohb ohbVar;
        this.E = i;
        Object obj = null;
        switch (i) {
            case 2:
                this.F = new int[2];
                break;
            case 5:
                this.F = new wwb(0, new tn4[16]);
                break;
            case 9:
                TimeUnit.MINUTES.getClass();
                q7h q7hVar = q7h.l;
                q7hVar.getClass();
                this.F = new ak6(q7hVar);
                break;
            case 11:
                this.F = bmg.a(tdi.b);
                break;
            case 12:
                this.F = new y50();
                break;
            case 16:
                this.F = new ArrayList(20);
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                aqa aqaVar = new aqa();
                this.F = aqaVar;
                if (!aqaVar.F) {
                    if (aqaVar.G) {
                        abd.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    aqaVar.a();
                    aqaVar.G = true;
                    break;
                }
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                this.F = new zka(obj);
                break;
            default:
                try {
                    ohbVar = (ohb) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    ohbVar = G;
                }
                ohb[] ohbVarArr = {c28.b, ohbVar};
                eqa eqaVar = new eqa();
                eqaVar.a = ohbVarArr;
                Charset charset = u89.a;
                this.F = eqaVar;
                break;
        }
    }

    public static boolean F(View view, float f, float f2, int[] iArr) {
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return f >= ((float) i) && f <= ((float) (i + view.getWidth())) && f2 >= ((float) i2) && f2 <= ((float) (i2 + view.getHeight()));
    }

    public static void H(gmf gmfVar, Context context) {
        double d = 0.2d;
        try {
            Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
            systemService.getClass();
            if (((ActivityManager) systemService).isLowRamDevice()) {
                d = 0.15d;
            }
        } catch (Exception unused) {
        }
        if (0.0d > d || d > 1.0d) {
            sz6.p("percent must be in the range [0.0, 1.0].");
        } else {
            gmfVar.F = new lab(d, context);
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
    public java.lang.Object A(com.anthropic.claude.tool.model.EventUpdateV0Input r7, defpackage.vp4 r8) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gmf.A(com.anthropic.claude.tool.model.EventUpdateV0Input, vp4):java.lang.Object");
    }

    public gmf B(gh3 gh3Var, jk9 jk9Var) {
        Class<?> cls;
        bce bceVarR;
        gh3Var.getClass();
        jk9Var.getClass();
        String strReplace = gh3Var.h().b().replace('.', '$');
        strReplace.getClass();
        if (!gh3Var.g().d()) {
            strReplace = gh3Var.g() + '.' + strReplace;
        }
        try {
            cls = Class.forName(strReplace, false, (ClassLoader) this.F);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null || (bceVarR = eve.r(cls)) == null) {
            return null;
        }
        return new gmf(18, bceVarR);
    }

    public ApplicationInfo C(int i, String str) {
        return ((Context) this.F).getPackageManager().getApplicationInfo(str, i);
    }

    public ulg D() {
        return (ulg) ((amg) this.F).getValue();
    }

    public PackageInfo E(int i, String str) {
        return ((Context) this.F).getPackageManager().getPackageInfo(str, i);
    }

    public boolean G() {
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Context context = (Context) this.F;
        if (callingUid == iMyUid) {
            return oq5.J(context);
        }
        String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid != null) {
            return context.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }

    public i99 I(i49 i49Var, AndroidComposeView androidComposeView) {
        long jC;
        boolean zA;
        long jG;
        zka zkaVar = (zka) this.F;
        zka zkaVar2 = new zka(i49Var.L0().size());
        List listL0 = i49Var.L0();
        int size = listL0.size();
        for (int i = 0; i < size; i++) {
            b8d b8dVar = (b8d) listL0.get(i);
            a8d a8dVar = (a8d) zkaVar.b(b8dVar.d());
            if (a8dVar == null) {
                zA = false;
                jC = b8dVar.m();
                jG = b8dVar.g();
            } else {
                jC = a8dVar.c();
                zA = a8dVar.a();
                jG = androidComposeView.G(a8dVar.b());
            }
            zkaVar2.f(b8dVar.d(), new z7d(b8dVar.d(), b8dVar.m(), b8dVar.g(), b8dVar.b(), b8dVar.i(), jC, jG, zA, b8dVar.l(), b8dVar.c(), b8dVar.k(), b8dVar.j(), b8dVar.f(), b8dVar.e()));
            if (b8dVar.b()) {
                zkaVar.f(b8dVar.d(), new a8d(b8dVar.m(), b8dVar.h(), b8dVar.b()));
            } else {
                zkaVar.g(b8dVar.d());
            }
        }
        i99 i99Var = new i99();
        i99Var.F = zkaVar2;
        i99Var.G = i49Var;
        return i99Var;
    }

    public void J(String str) {
        str.getClass();
        ArrayList arrayList = (ArrayList) this.F;
        int i = 0;
        while (i < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public void K() {
        wwb wwbVar = (wwb) this.F;
        b79 b79VarH0 = wd6.H0(0, wwbVar.G);
        int i = b79VarH0.E;
        int i2 = b79VarH0.F;
        if (i <= i2) {
            while (true) {
                ((tn4) wwbVar.E[i]).b.resumeWith(iei.a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        wwbVar.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object L(defpackage.gh2 r20, defpackage.zy7 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.Object r2 = r0.F
            rok r2 = (defpackage.rok) r2
            if (r2 == 0) goto Lb
            goto L10
        Lb:
            java.lang.String r2 = "Called runAndWatch on a manager that has been disposed of"
            defpackage.zad.b(r2)
        L10:
            java.lang.Object r2 = r0.F
            rok r2 = (defpackage.rok) r2
            boolean r3 = r2 instanceof defpackage.e8g
            if (r3 == 0) goto L8b
            e8g r2 = (defpackage.e8g) r2
            mkf r3 = r2.J
            if (r3 == 0) goto L8b
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L8b
            xtb r3 = new xtb
            r3.<init>()
            mkf r4 = r2.J
            if (r4 == 0) goto L2e
            goto L33
        L2e:
            java.lang.String r5 = "promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second"
            defpackage.zad.b(r5)
        L33:
            fwb r5 = r2.H
            if (r5 != 0) goto L40
            java.lang.Object r5 = r2.F
            r5.getClass()
            r3.L0(r4, r5)
            goto L83
        L40:
            java.lang.Object[] r6 = r5.b
            long[] r5 = r5.a
            int r7 = r5.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L83
            r8 = 0
            r9 = r8
        L4b:
            r10 = r5[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L7e
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r8
        L65:
            if (r14 >= r12) goto L7c
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L78
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r6[r15]
            r3.L0(r4, r15)
        L78:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L65
        L7c:
            if (r12 != r13) goto L83
        L7e:
            if (r9 == r7) goto L83
            int r9 = r9 + 1
            goto L4b
        L83:
            r3.m0()
            r2.o0()
            r0.F = r3
        L8b:
            java.lang.Object r0 = r0.F
            rok r0 = (defpackage.rok) r0
            r0.getClass()
            bz7 r2 = r0.v0(r1)
            rcg r3 = defpackage.ycg.j()
            rcg r2 = r3.u(r2)
            r0.l0(r1)
            rcg r1 = r2.j()     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r3 = r21.a()     // Catch: java.lang.Throwable -> Lb5
            defpackage.rcg.q(r1)     // Catch: java.lang.Throwable -> Lb3
            r2.c()
            r0.m0()
            return r3
        Lb3:
            r0 = move-exception
            goto Lba
        Lb5:
            r0 = move-exception
            defpackage.rcg.q(r1)     // Catch: java.lang.Throwable -> Lb3
            throw r0     // Catch: java.lang.Throwable -> Lb3
        Lba:
            r2.c()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gmf.L(gh2, zy7):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ulg M(defpackage.ulg r5) {
        /*
            r4 = this;
            r5.getClass()
            java.lang.Object r4 = r4.F
            amg r4 = (defpackage.amg) r4
        L7:
            java.lang.Object r0 = r4.getValue()
            r1 = r0
            ulg r1 = (defpackage.ulg) r1
            boolean r2 = r1 instanceof defpackage.e3e
            if (r2 != 0) goto L3d
            tdi r2 = defpackage.tdi.b
            boolean r2 = defpackage.x44.r(r1, r2)
            if (r2 == 0) goto L1b
            goto L3d
        L1b:
            boolean r2 = r1 instanceof defpackage.qf5
            if (r2 == 0) goto L29
            int r2 = r5.a
            r3 = r1
            qf5 r3 = (defpackage.qf5) r3
            int r3 = r3.a
            if (r2 <= r3) goto L3e
            goto L3d
        L29:
            boolean r2 = r1 instanceof defpackage.cl7
            if (r2 == 0) goto L2e
            goto L3e
        L2e:
            boolean r4 = r1 instanceof defpackage.x4c
            r5 = 0
            if (r4 == 0) goto L39
            java.lang.String r4 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            defpackage.sz6.j(r4)
            return r5
        L39:
            defpackage.mr9.b()
            return r5
        L3d:
            r1 = r5
        L3e:
            boolean r0 = r4.l(r0, r1)
            if (r0 == 0) goto L7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gmf.M(ulg):ulg");
    }

    @Override // defpackage.m4i
    public void a(Context context) {
    }

    @Override // defpackage.a03
    public boolean b() {
        f03 f03Var = (f03) this.F;
        wqd wqdVar = f03Var.h;
        lsc lscVar = f03Var.r;
        return wqdVar.r((gnd) lscVar.getValue()).isEmpty() && wqdVar.m((gnd) lscVar.getValue());
    }

    @Override // defpackage.szb
    public uwb c(a2 a2Var) {
        return ((y50) this.F).d(a2Var);
    }

    @Override // defpackage.a03
    public List d() {
        f03 f03Var = (f03) this.F;
        wqd wqdVar = f03Var.h;
        ArrayList arrayListR = wqdVar.r((gnd) f03Var.r.getValue());
        ProjectId projectId = (ProjectId) f03Var.q.getValue();
        String strM1085unboximpl = projectId != null ? projectId.m1085unboximpl() : null;
        if (strM1085unboximpl == null) {
            return arrayListR;
        }
        d8a d8aVarE = x44.E();
        wqdVar.getClass();
        Project projectB = wqdVar.h.b(strM1085unboximpl);
        if (projectB != null) {
            Project project = okk.z(projectB) ? null : projectB;
            if (project != null) {
                d8aVarE.add(project);
            }
        }
        for (Object obj : arrayListR) {
            if (!ProjectId.m1082equalsimpl0(((Project) obj).m404getUuid5pmjbU(), strM1085unboximpl)) {
                d8aVarE.add(obj);
            }
        }
        return x44.v(d8aVarE);
    }

    @Override // defpackage.qc
    public void e(Object obj) {
        pc pcVar = (pc) obj;
        rx7 rx7Var = (rx7) this.F;
        nx7 nx7Var = (nx7) rx7Var.F.pollFirst();
        if (nx7Var == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = nx7Var.E;
        int i = nx7Var.F;
        cx7 cx7VarE = rx7Var.c.E(str);
        if (cx7VarE != null) {
            cx7VarE.t(i, pcVar.E, pcVar.F);
            return;
        }
        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
    }

    @Override // defpackage.ro7
    public float f() {
        return MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    @Override // defpackage.ro7
    public float g(float f, long j) {
        return ((go7) this.F).a(f).b(j / 1000000);
    }

    @Override // defpackage.ivd
    public Object get() {
        switch (this.E) {
            case 10:
                int i = 0;
                return new fj0((Context) ((gmf) this.F).F, (Object) new g6j(i), (Object) new cli(i));
            case g.MAX_FIELD_NUMBER /* 17 */:
                return this.F;
            default:
                return new i7f(Integer.valueOf(i7f.H).intValue(), (Context) ((ivd) this.F).get(), "com.google.android.datatransport.events");
        }
    }

    @Override // defpackage.a03
    public boolean h() {
        f03 f03Var = (f03) this.F;
        return x44.r(f03Var.h.k((gnd) f03Var.r.getValue(), null).a, Boolean.TRUE);
    }

    @Override // defpackage.ro7
    public long i(float f) {
        go7 go7Var = (go7) this.F;
        go7Var.getClass();
        float[] fArr = i20.a;
        return ((long) (Math.exp(i20.a(f, go7Var.E * go7Var.F) / (((double) ho7.a) - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // defpackage.a03
    public boolean j() {
        f03 f03Var = (f03) this.F;
        return f03Var.h.k((gnd) f03Var.r.getValue(), null).b;
    }

    @Override // defpackage.m4i
    public void k(k99 k99Var, Context context) {
        k99Var.getClass();
        context.getClass();
    }

    @Override // defpackage.vg3
    public ug3 l(gh3 gh3Var) {
        ug3 ug3VarL;
        gh3Var.getClass();
        zmc zmcVar = (zmc) this.F;
        ww7 ww7VarG = gh3Var.g();
        ww7VarG.getClass();
        ArrayList<wmc> arrayList = new ArrayList();
        zmcVar.b(ww7VarG, arrayList);
        for (wmc wmcVar : arrayList) {
            if ((wmcVar instanceof vz1) && (ug3VarL = ((vz1) wmcVar).M.l(gh3Var)) != null) {
                return ug3VarL;
            }
        }
        return null;
    }

    public void m(bz7 bz7Var, pz7 pz7Var) {
        bz7Var.getClass();
        ((y50) this.F).a(new ujg(bz7Var, pz7Var));
    }

    @Override // defpackage.sb
    public oyi n(View view, float f, float f2) {
        if (F(view, f, f2, (int[]) this.F) && view.getVisibility() == 0 && (ScrollingView.class.isAssignableFrom(view.getClass()) || AbsListView.class.isAssignableFrom(view.getClass()) || ScrollView.class.isAssignableFrom(view.getClass()))) {
            return new oyi(new WeakReference(view));
        }
        return null;
    }

    @Override // defpackage.ro7
    public float o(float f, float f2) {
        go7 go7Var = (go7) this.F;
        go7Var.getClass();
        float[] fArr = i20.a;
        float f3 = go7Var.E;
        float f4 = go7Var.F;
        double dA = i20.a(f2, f3 * f4);
        double d = ho7.a;
        return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * dA) * ((double) (f3 * f4))))) + f;
    }

    @Override // defpackage.sb
    public oyi p(View view, float f, float f2) {
        if (F(view, f, f2, (int[]) this.F) && view.isClickable() && view.getVisibility() == 0) {
            return new oyi(new WeakReference(view));
        }
        return null;
    }

    @Override // defpackage.lye
    public void q(String str, boolean z) {
        str.getClass();
        lye[] lyeVarArr = (lye[]) this.F;
        for (int i = 0; i < 2; i++) {
            lyeVarArr[i].q(str, z);
        }
    }

    @Override // defpackage.a03
    public void r() {
        f03 f03Var = (f03) this.F;
        gb9.D(f03Var.a, null, null, new b03(f03Var, null, 0), 3);
    }

    public void s(String str, String str2) {
        str.getClass();
        str2.getClass();
        skj.c(str);
        skj.d(str2, str);
        skj.a(this, str, str2);
    }

    @Override // defpackage.ro7
    public float t(long j, float f, float f2) {
        return ((go7) this.F).a(f2).a(j / 1000000) + f;
    }

    public void u(String str, String str2) {
        str.getClass();
        str2.getClass();
        skj.c(str);
        skj.a(this, str, str2);
    }

    public wg8 v() {
        return new wg8((String[]) ((ArrayList) this.F).toArray(new String[0]));
    }

    @Override // defpackage.lp3
    public /* bridge */ /* synthetic */ Object w(Context context, Object obj, String str, cxh cxhVar) {
        return A((EventUpdateV0Input) obj, cxhVar);
    }

    public w4e x() {
        g11 g11Var = new g11(8, false, false);
        lab labVar = (lab) this.F;
        if (labVar != null) {
            return new w4e(new g5e(((Number) labVar.a()).longValue(), g11Var), g11Var);
        }
        sz6.j("maxSizeBytesFactory == null");
        return null;
    }

    public void y(CancellationException cancellationException) {
        wwb wwbVar = (wwb) this.F;
        int i = wwbVar.G;
        ta2[] ta2VarArr = new ta2[i];
        for (int i2 = 0; i2 < i; i2++) {
            ta2VarArr[i2] = ((tn4) wwbVar.E[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            ta2VarArr[i3].q(cancellationException);
        }
        if (wwbVar.G == 0) {
            return;
        }
        e39.c("uncancelled requests present");
    }

    public boolean z(File file) {
        g99 g99Var = g99.G;
        g99 g99Var2 = g99.F;
        file.getClass();
        try {
            return nk7.l0(file);
        } catch (FileNotFoundException e) {
            dch.I((h99) this.F, 5, x44.X(g99Var2, g99Var), new fh1(file, 6), e, 48);
            return false;
        } catch (SecurityException e2) {
            dch.I((h99) this.F, 5, x44.X(g99Var2, g99Var), new fh1(file, 7), e2, 48);
            return false;
        }
    }

    public /* synthetic */ gmf(int i, boolean z) {
        this.E = i;
    }

    public gmf(h99 h99Var) {
        this.E = 14;
        h99Var.getClass();
        this.F = h99Var;
    }

    public gmf(ec ecVar, l45 l45Var) {
        this.E = 0;
        dbc dbcVar = dbc.E;
        h86.a.getClass();
        ft5 ft5Var = g86.a;
        ft5Var.getClass();
        this.F = dbcVar;
        gb9.D(l45Var, ft5Var, null, new rrb(ecVar, this, null, 7), 2);
    }

    public gmf(cz5 cz5Var) {
        this.E = 29;
        this.F = new go7(qig.a, cz5Var);
    }

    public gmf(boolean z) {
        this.E = 4;
        this.F = new AtomicBoolean(z);
    }

    public /* synthetic */ gmf(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    public gmf(rz7 rz7Var, rz7 rz7Var2) {
        this.E = 27;
        this.F = rz7Var;
    }
}
