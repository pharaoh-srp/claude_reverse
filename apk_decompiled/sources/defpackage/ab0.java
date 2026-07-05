package defpackage;

import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.app.appstart.CachedData;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.login.SSOIntentData;
import com.anthropic.claude.types.strings.ProjectId;
import com.anthropic.claude.ui.components.error.a;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.KSerializer;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.RealBufferedSink;
import okio.RealBufferedSink$outputStream$1;

/* JADX INFO: loaded from: classes.dex */
public final class ab0 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab0(jz6 jz6Var, Object obj, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 8;
        this.G = jz6Var;
        this.F = obj;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                ab0 ab0Var = new ab0((m9j) obj2, tp4Var, 0);
                ab0Var.F = obj;
                return ab0Var;
            case 1:
                ab0 ab0Var2 = new ab0((hw2) obj2, tp4Var, 1);
                ab0Var2.F = obj;
                return ab0Var2;
            case 2:
                return new ab0((nwb) this.F, (nwb) obj2, tp4Var, 2);
            case 3:
                ab0 ab0Var3 = new ab0((hw2) obj2, tp4Var, 3);
                ProjectId projectId = (ProjectId) obj;
                ab0Var3.F = projectId != null ? projectId.m1085unboximpl() : null;
                return ab0Var3;
            case 4:
                return new ab0((of6) this.F, (ps7) obj2, tp4Var, 4);
            case 5:
                ab0 ab0Var4 = new ab0((el3) obj2, tp4Var, 5);
                ab0Var4.F = obj;
                return ab0Var4;
            case 6:
                ab0 ab0Var5 = new ab0((pd5) obj2, tp4Var, 6);
                ab0Var5.F = obj;
                return ab0Var5;
            case 7:
                ab0 ab0Var6 = new ab0((ulg) obj2, tp4Var, 7);
                ab0Var6.F = obj;
                return ab0Var6;
            case 8:
                return new ab0((jz6) obj2, this.F, tp4Var);
            case 9:
                return new ab0((pe6) this.F, (uf6) obj2, tp4Var, 9);
            case 10:
                return new ab0((pe6) this.F, (nwb) obj2, tp4Var, 10);
            case 11:
                ab0 ab0Var7 = new ab0((zy7) obj2, tp4Var, 11);
                ab0Var7.F = obj;
                return ab0Var7;
            case 12:
                return new ab0((fk0) this.F, (koi) obj2, tp4Var, 12);
            case 13:
                return new ab0((u2a) this.F, (w59) obj2, tp4Var, 13);
            case 14:
                return new ab0((of6) this.F, (nf6) obj2, tp4Var, 14);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new ab0((of6) this.F, (bt7) obj2, tp4Var, 15);
            case 16:
                return new ab0((jk5) this.F, (CachedData) obj2, tp4Var, 16);
            case g.MAX_FIELD_NUMBER /* 17 */:
                ab0 ab0Var8 = new ab0((pz7) obj2, tp4Var, 17);
                ab0Var8.F = obj;
                return ab0Var8;
            case g.AVG_FIELD_NUMBER /* 18 */:
                tp4Var.getClass();
                return new ab0((lpg) this.F, (epg) obj2, tp4Var, 18);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                tp4Var.getClass();
                return new ab0((lpg) this.F, (fpg) obj2, tp4Var, 19);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ab0 ab0Var9 = new ab0((sih) obj2, tp4Var, 20);
                ab0Var9.F = obj;
                return ab0Var9;
            default:
                return new ab0((qoh) this.F, (toh) obj2, tp4Var, 21);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((ab0) create((SSOIntentData) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 1:
                ((ab0) create((do7) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 2:
                ((ab0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 3:
                ProjectId projectId = (ProjectId) obj;
                String strM1085unboximpl = projectId != null ? projectId.m1085unboximpl() : null;
                ((ab0) create(strM1085unboximpl != null ? ProjectId.m1079boximpl(strM1085unboximpl) : null, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 4:
                ((ab0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 5:
                return ((ab0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 6:
                return ((ab0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 7:
                return ((ab0) create((ulg) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 8:
                ((ab0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 9:
                ((ab0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 10:
                ((ab0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 11:
                return ((ab0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 12:
                ((ab0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 13:
                ((ab0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 14:
                ((ab0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((ab0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 16:
                ((ab0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                return ((ab0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((ab0) create(obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((ab0) create(obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return ((ab0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                ((ab0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        Path pathE;
        Path pathE2;
        int i = this.E;
        int i2 = 4;
        int i3 = 2;
        boolean z = true;
        int i4 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        iei ieiVar = iei.a;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                SSOIntentData sSOIntentData = (SSOIntentData) this.F;
                sf5.h0(obj);
                m9j m9jVar = (m9j) obj2;
                String code = sSOIntentData.getCode();
                String state = sSOIntentData.getState();
                if (code == null || state == null) {
                    bik.g(m9jVar.m, "sso", new yme("client_error", "sso_callback_missing_params"));
                    a.a(new ut6(R.string.login_sso_invalid_response), m9jVar.o);
                } else {
                    m9jVar.u.setValue(Boolean.TRUE);
                    gb9.D(m9jVar.a, null, null, new t5h(m9jVar, code, state, (tp4) null), 3);
                }
                return ieiVar;
            case 1:
                do7 do7Var = (do7) this.F;
                sf5.h0(obj);
                ((hw2) obj2).p.setValue(do7Var);
                return ieiVar;
            case 2:
                sf5.h0(obj);
                if (((di4) ((nwb) this.F).getValue()) == null) {
                    ((nwb) obj2).setValue(null);
                }
                return ieiVar;
            case 3:
                String str = (String) this.F;
                sf5.h0(obj);
                ((hw2) obj2).s.setValue(str != null ? ProjectId.m1079boximpl(str) : null);
                return ieiVar;
            case 4:
                sf5.h0(obj);
                q28 q28Var = ((of6) this.F).b;
                if (((ry) q28Var.F).l.getValue() != null && ((og6) ((wz5) q28Var.G).getValue()) != ((og6) q28Var.p()) && ((og6) ((wz5) q28Var.G).getValue()) == og6.F) {
                    ((ps7) obj2).b(false);
                }
                return ieiVar;
            case 5:
                l45 l45Var = (l45) this.F;
                sf5.h0(obj);
                el3 el3Var = (el3) obj2;
                gb9.D(l45Var, null, null, new cl3(el3Var, objArr6 == true ? 1 : 0, i4), 3);
                gb9.D(l45Var, el3Var.e.b(), null, new dl3(el3Var, objArr5 == true ? 1 : 0, i4), 2);
                gb9.D(l45Var, null, null, new dl3(el3Var, objArr4 == true ? 1 : 0, z ? 1 : 0), 3);
                gb9.D(l45Var, null, null, new dl3(el3Var, objArr3 == true ? 1 : 0, i3), 3);
                gb9.D(l45Var, null, null, new cl3(el3Var, objArr2 == true ? 1 : 0, z ? 1 : 0), 3);
                return gb9.D(l45Var, null, null, new cj(el3Var, objArr == true ? 1 : 0, 11), 3);
            case 6:
                sf5.h0(obj);
                l45 l45Var2 = (l45) this.F;
                pd5 pd5Var = (pd5) obj2;
                AtomicReference atomicReference = pd5Var.b;
                fkg fkgVarD = gb9.D(l45Var2, null, null, new dx(atomicReference.getAndSet(null), (Object) pd5Var, (tp4) (objArr7 == true ? 1 : 0), 16), 3);
                while (true) {
                    if (!atomicReference.compareAndSet(null, fkgVarD)) {
                        if (atomicReference.get() != null) {
                            z = false;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 7:
                ulg ulgVar = (ulg) this.F;
                sf5.h0(obj);
                return Boolean.valueOf((ulgVar instanceof qf5) && ((qf5) ulgVar).a <= ((qf5) ((ulg) obj2)).a);
            case 8:
                sf5.h0(obj);
                final jz6 jz6Var = (jz6) obj2;
                xf7 xf7Var = jz6Var.H;
                File file = jz6Var.E;
                if (jz6Var.O >= 102400) {
                    jz6Var.d();
                    long jB = jz6Var.I.c().b();
                    jz6Var.e().renameTo(new File(file, jz6Var.L + jB + ".jsonl"));
                }
                File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: gz6
                    @Override // java.io.FileFilter
                    public final boolean accept(File file2) {
                        String name = file2.getName();
                        name.getClass();
                        if (isg.q0(name, jz6Var.L, false)) {
                            String name2 = file2.getName();
                            name2.getClass();
                            if (isg.h0(name2, ".jsonl", false)) {
                                return true;
                            }
                        }
                        return false;
                    }
                });
                if (fileArrListFiles != null) {
                    List listU0 = mp0.U0(fileArrListFiles, new iec(i2));
                    int size = listU0.size() - 10;
                    if (size > 0) {
                        List listJ1 = w44.j1(listU0, size);
                        if (!(listJ1 instanceof Collection) || !listJ1.isEmpty()) {
                            Iterator it = listJ1.iterator();
                            while (it.hasNext()) {
                                if (((File) it.next()).delete() && (i4 = i4 + 1) < 0) {
                                    x44.m0();
                                    throw null;
                                }
                            }
                        }
                        xf7Var.a(vb7.q("Event file limit exceeded: deleted ", " oldest files (had ", i4, listU0.size(), ", max 10)."), null);
                    }
                }
                try {
                    OutputStreamWriter outputStreamWriterC = jz6.c(jz6Var);
                    String strD = jz6Var.G.d(this.F, jz6Var.F);
                    outputStreamWriterC.write(strD);
                    outputStreamWriterC.write(10);
                    outputStreamWriterC.flush();
                    jz6Var.O += (long) (strD.length() + 1);
                    break;
                } catch (IOException e) {
                    xf7Var.a("Failed to write event", e);
                    jz6Var.d();
                }
                return ieiVar;
            case 9:
                sf5.h0(obj);
                pe6 pe6Var = (pe6) this.F;
                uf6 uf6Var = (uf6) obj2;
                pe6Var.getClass();
                uf6Var.getClass();
                lsc lscVar = pe6Var.h;
                if (x44.r((uf6) lscVar.getValue(), uf6Var)) {
                    lscVar.setValue(null);
                }
                return ieiVar;
            case 10:
                pe6 pe6Var2 = (pe6) this.F;
                sf5.h0(obj);
                nwb nwbVar = (nwb) obj2;
                int i5 = ho8.b;
                if (((Boolean) nwbVar.getValue()).booleanValue()) {
                    pe6Var2.a();
                    pe6Var2.f.setValue(ag6.E);
                } else {
                    nwbVar.setValue(Boolean.TRUE);
                }
                return ieiVar;
            case 11:
                l45 l45Var3 = (l45) this.F;
                sf5.h0(obj);
                c45 coroutineContext = l45Var3.getCoroutineContext();
                zy7 zy7Var = (zy7) obj2;
                try {
                    boh bohVar = new boh();
                    bohVar.M = knk.A(knk.z(coroutineContext), bohVar);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = boh.N;
                    while (true) {
                        int i6 = atomicIntegerFieldUpdater.get(bohVar);
                        if (i6 != 0) {
                            if (i6 != 2 && i6 != 3) {
                                boh.u(i6);
                                throw null;
                            }
                        } else if (!atomicIntegerFieldUpdater.compareAndSet(bohVar, i6, 0)) {
                        }
                    }
                    try {
                        return zy7Var.a();
                    } finally {
                        bohVar.t();
                    }
                } catch (InterruptedException e2) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e2);
                }
            case 12:
                sf5.h0(obj);
                fk0 fk0Var = (fk0) this.F;
                fk0Var.q(((koi) obj2).d);
                fk0Var.t.setValue(Boolean.TRUE);
                vb7.B(fk0Var.a, "has_logged_in_before", true);
                return ieiVar;
            case 13:
                sf5.h0(obj);
                u2a u2aVar = (u2a) this.F;
                gb9.D(u2aVar.b, null, null, new fj(u2aVar, objArr9 == true ? 1 : 0, 17), 3);
                w59 w59Var = (w59) obj2;
                if (!((Boolean) w59Var.c.E.getValue()).booleanValue()) {
                    gb9.D(w59Var.a, w59Var.b.b(), null, new al8((Object) w59Var, (tp4) (objArr8 == true ? 1 : 0), i2), 2);
                }
                return ieiVar;
            case 14:
                sf5.h0(obj);
                if (((og6) ((of6) this.F).b.p()) == og6.E) {
                    nf6 nf6Var = (nf6) obj2;
                    nf6Var.a.setValue(Boolean.TRUE);
                    nf6Var.b.i(MTTypesetterKt.kLineSkipLimitMultiplier);
                    nf6Var.c.i(MTTypesetterKt.kLineSkipLimitMultiplier);
                }
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                sf5.h0(obj);
                if (((of6) this.F).b()) {
                    bt7.a((bt7) obj2);
                }
                return ieiVar;
            case 16:
                jk5 jk5Var = (jk5) this.F;
                Path path = (Path) jk5Var.E;
                FileSystem fileSystem = (FileSystem) jk5Var.H;
                sf5.h0(obj);
                try {
                    fileSystem.e(path);
                    pathE = path.e("cache.json");
                    pathE2 = path.e("cache.json.tmp");
                    if (fileSystem.n(pathE2)) {
                        fileSystem.j(pathE2, false);
                    }
                    CachedData cachedData = (CachedData) obj2;
                    RealBufferedSink realBufferedSinkB = Okio.b(fileSystem.S(pathE2, false));
                    try {
                        zh4.q((bg9) jk5Var.J, CachedData.Companion.serializer((KSerializer) jk5Var.F), cachedData, new RealBufferedSink$outputStream$1(realBufferedSinkB));
                        try {
                            realBufferedSinkB.close();
                            th = null;
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            realBufferedSinkB.close();
                        } catch (Throwable th3) {
                            mwa.p(th, th3);
                        }
                        break;
                    }
                } catch (IOException e3) {
                    SilentException.a(new SilentException(grc.v("Failed to write cache to ", path), e3), null, false, 3);
                }
                if (th != null) {
                    throw th;
                }
                fileSystem.d(pathE2, pathE);
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                sf5.h0(obj);
                a45 a45VarX0 = ((l45) this.F).getCoroutineContext().x0(a5.G);
                a45VarX0.getClass();
                e45 e45Var = (e45) a45VarX0;
                v84 v84VarC = zni.c();
                gb9.C(u78.E, e45Var, o45.H, new cx((Object) v84VarC, obj2, (tp4) (objArr11 == true ? 1 : 0), 29));
                while (!v84VarC.Z()) {
                    try {
                        return gb9.V(e45Var, new fze(v84VarC, objArr10 == true ? 1 : 0, i4));
                    } catch (InterruptedException unused) {
                    }
                }
                return v84VarC.I();
            case g.AVG_FIELD_NUMBER /* 18 */:
                sf5.h0(obj);
                ((lpg) this.F).a.add((epg) obj2);
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                sf5.h0(obj);
                ((lpg) this.F).b.add((fpg) obj2);
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                sf5.h0(obj);
                l45 l45Var4 = (l45) this.F;
                sih sihVar = (sih) obj2;
                gb9.D(l45Var4, null, null, new rih(sihVar, objArr13 == true ? 1 : 0, i4), 3);
                return gb9.D(l45Var4, null, null, new rih(sihVar, objArr12 == true ? 1 : 0, z ? 1 : 0), 3);
            default:
                sf5.h0(obj);
                bt7 bt7Var = (bt7) ((qoh) this.F).H.get(null);
                if (bt7Var != null) {
                    bt7.a(bt7Var);
                }
                return ieiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ab0(Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ab0(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }
}
