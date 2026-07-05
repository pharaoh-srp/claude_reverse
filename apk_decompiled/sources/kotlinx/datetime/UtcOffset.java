package kotlinx.datetime;

import defpackage.hnf;
import defpackage.hpi;
import defpackage.mdj;
import defpackage.onf;
import defpackage.x44;
import defpackage.zoi;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.ZoneOffset;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001f"}, d2 = {"Lkotlinx/datetime/UtcOffset;", "Ljava/io/Serializable;", "Ljava/time/ZoneOffset;", "zoneOffset", "<init>", "(Ljava/time/ZoneOffset;)V", "Ljava/io/ObjectInputStream;", "ois", "Liei;", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "writeReplace", "()Ljava/lang/Object;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "Ljava/time/ZoneOffset;", "getZoneOffset$kotlinx_datetime", "()Ljava/time/ZoneOffset;", "getTotalSeconds", "totalSeconds", "Companion", "zoi", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
@onf(with = hpi.class)
public final class UtcOffset implements Serializable {
    public static final zoi Companion = new zoi();
    private static final UtcOffset ZERO;
    private static final long serialVersionUID = 0;
    private final ZoneOffset zoneOffset;

    static {
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        zoneOffset.getClass();
        ZERO = new UtcOffset(zoneOffset);
    }

    public UtcOffset(ZoneOffset zoneOffset) {
        zoneOffset.getClass();
        this.zoneOffset = zoneOffset;
    }

    private final void readObject(ObjectInputStream ois) throws InvalidObjectException {
        throw new InvalidObjectException("kotlinx.datetime.UtcOffset must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new hnf(10, this);
    }

    public boolean equals(Object other) {
        return (other instanceof UtcOffset) && x44.r(this.zoneOffset, ((UtcOffset) other).zoneOffset);
    }

    public final int getTotalSeconds() {
        return this.zoneOffset.getTotalSeconds();
    }

    /* JADX INFO: renamed from: getZoneOffset$kotlinx_datetime, reason: from getter */
    public final ZoneOffset getZoneOffset() {
        return this.zoneOffset;
    }

    public int hashCode() {
        return this.zoneOffset.hashCode();
    }

    public String toString() {
        String string = this.zoneOffset.toString();
        string.getClass();
        return string;
    }
}
