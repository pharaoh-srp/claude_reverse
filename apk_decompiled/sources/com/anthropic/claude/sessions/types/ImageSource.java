package com.anthropic.claude.sessions.types;

import defpackage.grc;
import defpackage.gvj;
import defpackage.hy8;
import defpackage.ij0;
import defpackage.iy8;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0017¨\u0006*"}, d2 = {"Lcom/anthropic/claude/sessions/types/ImageSource;", "", "", "type", "media_type", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/ImageSource;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/ImageSource;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getMedia_type", "getData", "Companion", "hy8", "iy8", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ImageSource {
    public static final iy8 Companion = new iy8();
    private final String data;
    private final String media_type;
    private final String type;

    public /* synthetic */ ImageSource(int i, String str, String str2, String str3, vnf vnfVar) {
        if (6 != (i & 6)) {
            gvj.f(i, 6, hy8.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.type = "base64";
        } else {
            this.type = str;
        }
        this.media_type = str2;
        this.data = str3;
    }

    public static /* synthetic */ ImageSource copy$default(ImageSource imageSource, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageSource.type;
        }
        if ((i & 2) != 0) {
            str2 = imageSource.media_type;
        }
        if ((i & 4) != 0) {
            str3 = imageSource.data;
        }
        return imageSource.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$sessions(ImageSource self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || !x44.r(self.type, "base64")) {
            output.q(serialDesc, 0, self.type);
        }
        output.q(serialDesc, 1, self.media_type);
        output.q(serialDesc, 2, self.data);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMedia_type() {
        return this.media_type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getData() {
        return this.data;
    }

    public final ImageSource copy(String type, String media_type, String data) {
        type.getClass();
        media_type.getClass();
        data.getClass();
        return new ImageSource(type, media_type, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageSource)) {
            return false;
        }
        ImageSource imageSource = (ImageSource) other;
        return x44.r(this.type, imageSource.type) && x44.r(this.media_type, imageSource.media_type) && x44.r(this.data, imageSource.data);
    }

    public final String getData() {
        return this.data;
    }

    public final String getMedia_type() {
        return this.media_type;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.data.hashCode() + kgh.l(this.type.hashCode() * 31, 31, this.media_type);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.media_type;
        return ij0.m(kgh.r("ImageSource(type=", str, ", media_type=", str2, ", data="), this.data, ")");
    }

    public ImageSource(String str, String str2, String str3) {
        grc.B(str, str2, str3);
        this.type = str;
        this.media_type = str2;
        this.data = str3;
    }

    public /* synthetic */ ImageSource(String str, String str2, String str3, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? "base64" : str, str2, str3);
    }
}
