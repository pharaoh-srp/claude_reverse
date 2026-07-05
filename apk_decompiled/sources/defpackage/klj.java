package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class klj extends rlj {
    public final zlj j;
    public final j5h k;
    public final /* synthetic */ llj l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klj(llj lljVar, j5h j5hVar) {
        super(0);
        Objects.requireNonNull(lljVar);
        this.l = lljVar;
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        this.j = new zlj("OnRequestIntegrityTokenCallback");
        this.k = j5hVar;
    }
}
