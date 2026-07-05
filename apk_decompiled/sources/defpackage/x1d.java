package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.AttachedSurfaceControl;
import android.view.SurfaceView;
import android.window.SurfaceSyncGroup;
import androidx.core.content.FileProvider;
import androidx.glance.session.SessionWorker;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.app.appstart.CachedData;
import com.anthropic.claude.code.ui.SessionInputData;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.models.organization.configtypes.SttSupportedLanguage;
import com.anthropic.claude.sessions.types.SessionFileContent;
import com.anthropic.claude.stt.repo.api.STTApiMessage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonElement;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.RealBufferedSink;
import okio.RealBufferedSink$outputStream$1;
import okio.RealBufferedSource;
import okio.RealBufferedSource$inputStream$1;

/* JADX INFO: loaded from: classes2.dex */
public final class x1d extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1d(phg phgVar, Object obj, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 12;
        this.G = phgVar;
        this.F = obj;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                x1d x1dVar = new x1d((ggc) obj2, tp4Var, 0);
                x1dVar.F = obj;
                return x1dVar;
            case 1:
                return new x1d((SurfaceView) this.F, (nwb) obj2, tp4Var, 1);
            case 2:
                return new x1d((e1a) this.F, (String) obj2, tp4Var, 2);
            case 3:
                return new x1d((jk5) this.F, (bz7) obj2, tp4Var, 3);
            case 4:
                return new x1d((a0f) this.F, (String) obj2, tp4Var, 4);
            case 5:
                return new x1d((j8f) this.F, (Bitmap) obj2, tp4Var, 5);
            case 6:
                return new x1d((jrf) this.F, (JsonElement) obj2, tp4Var, 6);
            case 7:
                return new x1d((psf) this.F, (SessionInputData) obj2, tp4Var, 7);
            case 8:
                x1d x1dVar2 = new x1d((SessionWorker) obj2, tp4Var, 8);
                x1dVar2.F = obj;
                return x1dVar2;
            case 9:
                x1d x1dVar3 = new x1d((nwb) obj2, tp4Var, 9);
                x1dVar3.F = obj;
                return x1dVar3;
            case 10:
                return new x1d((g2g) this.F, (h2g) obj2, tp4Var, 10);
            case 11:
                return new x1d((sn8) this.F, (phg) obj2, tp4Var, 11);
            case 12:
                return new x1d((phg) obj2, this.F, tp4Var);
            case 13:
                return new x1d((fk0) this.F, (nwb) obj2, tp4Var, 13);
            case 14:
                return new x1d((zy7) this.F, (nwb) obj2, tp4Var, 14);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new x1d((m0h) this.F, (bz7) obj2, tp4Var, 15);
            case 16:
                return new x1d((dnh) this.F, (Uri) obj2, tp4Var, 16);
            default:
                x1d x1dVar4 = new x1d((hdc) obj2, tp4Var, 17);
                x1dVar4.F = obj;
                return x1dVar4;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((x1d) create((gti) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 1:
                ((x1d) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 2:
                ((x1d) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 3:
                ((x1d) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 4:
                return ((x1d) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 5:
                return ((x1d) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 6:
                return ((x1d) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 7:
                return ((x1d) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 8:
                return ((x1d) create((atf) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 9:
                ((x1d) create((x1g) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 10:
                ((x1d) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 11:
                ((x1d) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 12:
                ((x1d) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 13:
                ((x1d) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 14:
                ((x1d) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((x1d) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 16:
                return ((x1d) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((x1d) create((String) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [tp4] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Exception {
        CachedData cachedData;
        Throwable th;
        Throwable th2;
        int columnIndex;
        int i = this.E;
        boolean z = true;
        iei ieiVar = iei.a;
        ?? r7 = 0;
        string = null;
        String string = null;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                gti gtiVar = (gti) this.F;
                sf5.h0(obj);
                if (x44.r(gtiVar, gti.a)) {
                    ((ggc) obj2).b.a();
                    return ieiVar;
                }
                wg6.i();
                return null;
            case 1:
                sf5.h0(obj);
                SurfaceView surfaceView = (SurfaceView) this.F;
                AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
                if (rootSurfaceControl == null) {
                    return ieiVar;
                }
                nwb nwbVar = (nwb) obj2;
                SurfaceSyncGroup surfaceSyncGroupL = ljb.l();
                if (!surfaceSyncGroupL.add(rootSurfaceControl, new qz(1))) {
                    sz6.j("Failed to add rootSurfaceControl to SurfaceSyncGroup");
                    return null;
                }
                nwbVar.setValue(surfaceSyncGroupL);
                surfaceView.invalidate();
                rootSurfaceControl.applyTransactionOnDraw(n6b.j());
                return ieiVar;
            case 2:
                sf5.h0(obj);
                e1a e1aVar = (e1a) this.F;
                String str = (String) obj2;
                e1aVar.getClass();
                if (!str.equals(e1aVar.c)) {
                    e1aVar.c = str;
                    gb9.D(e1aVar.a, null, null, new ix5(e1aVar, str, r7, 21), 3);
                }
                return ieiVar;
            case 3:
                jk5 jk5Var = (jk5) this.F;
                KSerializer kSerializer = (KSerializer) jk5Var.F;
                bg9 bg9Var = (bg9) jk5Var.J;
                Path path = (Path) jk5Var.E;
                FileSystem fileSystem = (FileSystem) jk5Var.H;
                sf5.h0(obj);
                try {
                    Path pathE = path.e("cache.json");
                    if (fileSystem.n(pathE)) {
                        RealBufferedSource realBufferedSourceC = Okio.c(fileSystem.T(pathE));
                        try {
                            CachedData cachedData2 = (CachedData) zh4.p(bg9Var, CachedData.Companion.serializer(kSerializer), new RealBufferedSource$inputStream$1(realBufferedSourceC));
                            try {
                                realBufferedSourceC.close();
                                th = null;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            cachedData = cachedData2;
                        } catch (Throwable th4) {
                            try {
                                realBufferedSourceC.close();
                            } catch (Throwable th5) {
                                mwa.p(th4, th5);
                            }
                            cachedData = null;
                            th = th4;
                        }
                        if (th != null) {
                            throw th;
                        }
                        CachedData cachedDataCopy$default = CachedData.copy$default(cachedData, ((bz7) obj2).invoke(cachedData.getResponse()), 0L, 2, null);
                        Path pathE2 = path.e("cache.json.tmp");
                        if (fileSystem.n(pathE2)) {
                            fileSystem.j(pathE2, false);
                        }
                        RealBufferedSink realBufferedSinkB = Okio.b(fileSystem.S(pathE2, false));
                        try {
                            zh4.q(bg9Var, CachedData.Companion.serializer(kSerializer), cachedDataCopy$default, new RealBufferedSink$outputStream$1(realBufferedSinkB));
                            try {
                                realBufferedSinkB.close();
                                th2 = null;
                            } catch (Throwable th6) {
                                th2 = th6;
                            }
                        } catch (Throwable th7) {
                            try {
                                realBufferedSinkB.close();
                            } catch (Throwable th8) {
                                mwa.p(th7, th8);
                            }
                            th2 = th7;
                            break;
                        }
                        if (th2 != null) {
                            throw th2;
                        }
                        fileSystem.d(pathE2, pathE);
                        break;
                    }
                } catch (Exception e) {
                    SilentException.a(new SilentException(grc.v("Failed to update cache at ", path), e), null, false, 3);
                }
                return ieiVar;
            case 4:
                sf5.h0(obj);
                try {
                    STTApiMessage sTTApiMessage = (STTApiMessage) ((a0f) this.F).d.b((String) obj2, STTApiMessage.Companion.serializer());
                    if (sTTApiMessage instanceof STTApiMessage.Unknown) {
                        return null;
                    }
                    return sTTApiMessage;
                } catch (Exception e2) {
                    if ((e2 instanceof SerializationException) || (e2 instanceof IllegalArgumentException)) {
                        List list = xah.a;
                        xah.f(e2, "Failed to parse STT message", null, null, 28);
                    }
                    throw e2;
                }
            case 5:
                j8f j8fVar = (j8f) this.F;
                sf5.h0(obj);
                try {
                    File file = new File(oq5.G(j8fVar.a), "tmp_feedback");
                    file.mkdirs();
                    File file2 = new File(file, "shake_" + System.currentTimeMillis() + ".png");
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        ((Bitmap) obj2).compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.close();
                        Context context = j8fVar.a;
                        return FileProvider.d(context, context.getPackageName() + ".provider", file2);
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } catch (Exception e3) {
                    zfa.a.getClass();
                    if (!yfa.b()) {
                        return null;
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj3)).getClass();
                        arrayList.add(obj3);
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    String strQ = sq6.q(zfa.a, e3, "Failed to write screenshot: ");
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((n30) ((zfa) it.next())).b(sfa.ERROR, "ScreenshotTaker", strQ);
                    }
                    return null;
                }
            case 6:
                sf5.h0(obj);
                bg9 bg9Var2 = ((jrf) this.F).e;
                bg9Var2.getClass();
                return new h3e((SessionFileContent) bg9Var2.a(SessionFileContent.Companion.serializer(), (JsonElement) obj2));
            case 7:
                psf psfVar = (psf) this.F;
                Context context2 = psfVar.a;
                SessionInputData sessionInputData = (SessionInputData) obj2;
                sf5.h0(obj);
                try {
                    String sessionId = sessionInputData.getSessionId();
                    File file3 = new File(oq5.G(context2), "session_input");
                    file3.mkdirs();
                    File file4 = new File(file3, "session_" + sessionId + ".json");
                    if (bsg.I0(sessionInputData.getInputText()) && sessionInputData.getComments().isEmpty() && sessionInputData.getPendingAskUserQuestionSelections() == null && sessionInputData.getSubmittedAskUserQuestionAnswers().isEmpty()) {
                        if (file4.exists()) {
                            file4.delete();
                        }
                        return Boolean.TRUE;
                    }
                    String str2 = "session_" + sessionInputData.getSessionId() + ".json";
                    File file5 = new File(oq5.G(context2), "session_input");
                    file5.mkdirs();
                    String strD = psfVar.c.d(sessionInputData, SessionInputData.Companion.serializer());
                    File fileCreateTempFile = File.createTempFile(str2, ".tmp", file5);
                    fileCreateTempFile.getClass();
                    Charset charset = dj2.a;
                    charset.getClass();
                    FileOutputStream fileOutputStream2 = new FileOutputStream(fileCreateTempFile);
                    try {
                        nk7.s0(fileOutputStream2, strD, charset);
                        fileOutputStream2.close();
                        fileCreateTempFile.renameTo(file4);
                    } finally {
                    }
                } catch (Exception e4) {
                    List list2 = xah.a;
                    xah.f(e4, "Failed to save session input data", null, null, 28);
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                sf5.h0(obj);
                return (wm0) ((atf) this.F).a.get(((SessionWorker) obj2).k);
            case 9:
                x1g x1gVar = (x1g) this.F;
                sf5.h0(obj);
                if (x44.r(x1gVar, x1g.a)) {
                    ((nwb) obj2).setValue(Boolean.TRUE);
                    return ieiVar;
                }
                wg6.i();
                return null;
            case 10:
                sf5.h0(obj);
                g2g g2gVar = (g2g) this.F;
                if (g2gVar.b().isEmpty()) {
                    g2gVar.b.L.remove(g2gVar.a);
                }
                return ieiVar;
            case 11:
                phg phgVar = (phg) obj2;
                lsc lscVar = phgVar.l;
                sf5.h0(obj);
                qn8 qn8VarA = ((sn8) this.F).a();
                int i2 = qn8VarA == null ? -1 : mhg.a[qn8VarA.ordinal()];
                if (i2 == -1) {
                    return ieiVar;
                }
                if (i2 == 1) {
                    lscVar.setValue(Boolean.TRUE);
                    phgVar.O();
                    phgVar.S(new vv(phgVar, z, 4), false);
                    return ieiVar;
                }
                if (i2 != 2) {
                    wg6.i();
                    return null;
                }
                lscVar.setValue(Boolean.TRUE);
                phgVar.O();
                phgVar.S(new pza(25, phgVar), true);
                return ieiVar;
            case 12:
                sf5.h0(obj);
                phg phgVar2 = (phg) obj2;
                Object obj4 = phgVar2.o;
                Object obj5 = this.F;
                if (obj4 == obj5) {
                    fkg fkgVar = phgVar2.n;
                    if (fkgVar != null) {
                        fkgVar.d(null);
                    }
                    phgVar2.n = gb9.D(phgVar2.a, null, null, new o6e(phgVar2, obj5, (tp4) null), 3);
                }
                return ieiVar;
            case 13:
                sf5.h0(obj);
                fk0 fk0Var = (fk0) this.F;
                if (fk0Var.f() == null) {
                    fk0Var.s(((SttSupportedLanguage) ((nwb) obj2).getValue()).getCode());
                }
                return ieiVar;
            case 14:
                sf5.h0(obj);
                nwb nwbVar2 = (nwb) obj2;
                iqb iqbVar = zxg.a;
                if (!((Boolean) nwbVar2.getValue()).booleanValue()) {
                    nwbVar2.setValue(Boolean.TRUE);
                    ((zy7) this.F).a();
                }
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                sf5.h0(obj);
                m0h m0hVar = (m0h) this.F;
                q28 q28Var = m0hVar.a;
                q28 q28Var2 = m0hVar.a;
                n0h n0hVar = (n0h) q28Var.p();
                n0h n0hVar2 = n0h.G;
                if (n0hVar != n0hVar2) {
                    bz7 bz7Var = (bz7) obj2;
                    if (((ry) q28Var2.F).j.h() != MTTypesetterKt.kLineSkipLimitMultiplier && !Float.isNaN(((ry) q28Var2.F).j.h())) {
                        n0hVar2 = ((ry) q28Var2.F).j.h() > MTTypesetterKt.kLineSkipLimitMultiplier ? n0h.E : n0h.F;
                    }
                    bz7Var.invoke(n0hVar2);
                }
                return ieiVar;
            case 16:
                sf5.h0(obj);
                Cursor cursorQuery = ((dnh) this.F).a.getContentResolver().query((Uri) obj2, null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("tools")) >= 0) {
                            string = cursorQuery.getString(columnIndex);
                        }
                        cursorQuery.close();
                        r7 = string;
                        break;
                    } catch (Throwable th9) {
                        try {
                            throw th9;
                        } catch (Throwable th10) {
                            wd6.Z(cursorQuery, th9);
                            throw th10;
                        }
                    }
                }
                return r7;
            default:
                String str3 = (String) this.F;
                sf5.h0(obj);
                jie jieVar = new jie();
                jieVar.g(str3);
                pqe pqeVarF = new f4e((hdc) obj2, new kie(jieVar), false).f();
                try {
                    if (pqeVarF.U) {
                        byte[] bArrC = pqeVarF.K.c();
                        pqeVarF.close();
                        return bArrC;
                    }
                    throw new IOException("Unexpected response " + pqeVarF.H + " fetching voice sample");
                } catch (Throwable th11) {
                    try {
                        throw th11;
                    } catch (Throwable th12) {
                        wd6.Z(pqeVarF, th11);
                        throw th12;
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1d(Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1d(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }
}
