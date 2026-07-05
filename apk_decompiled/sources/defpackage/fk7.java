package defpackage;

import com.anthropic.claude.chat.input.files.FileUploadWorker;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class fk7 extends vp4 {
    public File E;
    public /* synthetic */ Object F;
    public final /* synthetic */ FileUploadWorker G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk7(FileUploadWorker fileUploadWorker, vp4 vp4Var) {
        super(vp4Var);
        this.G = fileUploadWorker;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.f(null, this);
    }
}
