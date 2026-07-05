package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zak extends rlj {
    public final bnh j;
    public final j5h k;
    public final /* synthetic */ cfk l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zak(cfk cfkVar, j5h j5hVar) {
        super(6);
        Objects.requireNonNull(cfkVar);
        this.l = cfkVar;
        attachInterface(this, "com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback");
        this.j = new bnh("OnCheckAgeSignalsCallback");
        this.k = j5hVar;
    }
}
