package defpackage;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.Syntax;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class peb extends Message {
    public static final neb I = new neb(FieldEncoding.LENGTH_DELIMITED, jce.a.b(peb.class), "type.googleapis.com/anthropic.mobile.v1alpha.MessageAttachment", Syntax.PROTO_3, null, "anthropic/mobile/v1alpha/completion.proto");
    public final String E;
    public final int F;
    public final String G;
    public final String H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public peb(String str, int i, String str2, String str3, ByteString byteString) {
        super(I, byteString);
        str.getClass();
        str2.getClass();
        str3.getClass();
        byteString.getClass();
        this.E = str;
        this.F = i;
        this.G = str2;
        this.H = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof peb)) {
            return false;
        }
        peb pebVar = (peb) obj;
        return x44.r(unknownFields(), pebVar.unknownFields()) && x44.r(this.E, pebVar.E) && this.F == pebVar.F && x44.r(this.G, pebVar.G) && x44.r(this.H, pebVar.H);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.H.hashCode() + kgh.l(vb7.c(this.F, kgh.l(unknownFields().hashCode() * 37, 37, this.E), 37), 37, this.G);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public final /* synthetic */ Message.Builder newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ms6.y("file_name=", Internal.sanitize(this.E), arrayList);
        arrayList.add("file_size=" + this.F);
        ms6.y("file_type=", Internal.sanitize(this.G), arrayList);
        ms6.y("extracted_content=", Internal.sanitize(this.H), arrayList);
        return w44.S0(arrayList, ", ", "MessageAttachment{", "}", null, 56);
    }
}
