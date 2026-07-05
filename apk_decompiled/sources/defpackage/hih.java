package defpackage;

import com.anthropic.claude.chat.input.files.i;
import com.anthropic.claude.core.telemetry.SilentException;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.CancellationException;
import okio.Okio;
import okio.RealBufferedSink;

/* JADX INFO: loaded from: classes2.dex */
public final class hih extends xzg implements pz7 {
    public final /* synthetic */ int E = 1;
    public /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hih(i iVar, String str, tie tieVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = iVar;
        this.G = str;
        this.H = tieVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.H;
        Object obj3 = this.G;
        switch (i) {
            case 0:
                hih hihVar = new hih(tp4Var, (e8d) obj2, (sih) obj3);
                hihVar.F = obj;
                return hihVar;
            default:
                return new hih((i) this.F, (String) obj3, (tie) obj2, tp4Var);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((hih) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        Object obj2 = this.H;
        Object obj3 = this.G;
        tp4 tp4Var = null;
        switch (i) {
            case 0:
                sf5.h0(obj);
                l45 l45Var = (l45) this.F;
                sih sihVar = (sih) obj3;
                e8d e8dVar = (e8d) obj2;
                ufh ufhVar = new ufh(sihVar, e8dVar, tp4Var, 1);
                o45 o45Var = o45.H;
                gb9.D(l45Var, null, o45Var, ufhVar, 1);
                gb9.D(l45Var, null, o45Var, new ufh(sihVar, e8dVar, tp4Var, 2), 1);
                return gb9.D(l45Var, null, o45Var, new ufh(null, e8dVar, sihVar), 1);
            default:
                sf5.h0(obj);
                File file = ((i) this.F).a;
                File file2 = new File(file, (String) obj3);
                try {
                    file.mkdirs();
                    RealBufferedSink realBufferedSink = new RealBufferedSink(Okio.e(new FileOutputStream(file2, false)));
                    try {
                        ((tie) obj2).writeTo(realBufferedSink);
                        realBufferedSink.close();
                        knk.u(getContext());
                        return file2;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            wd6.Z(realBufferedSink, th);
                            throw th2;
                        }
                    }
                } catch (CancellationException e) {
                    file2.delete();
                    throw e;
                } catch (Exception e2) {
                    SilentException.a(new SilentException("WorkManagerUploader: cache copy failed; falling back to inline upload", e2), null, false, 3);
                    file2.delete();
                    return null;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hih(tp4 tp4Var, e8d e8dVar, sih sihVar) {
        super(2, tp4Var);
        this.G = sihVar;
        this.H = e8dVar;
    }
}
