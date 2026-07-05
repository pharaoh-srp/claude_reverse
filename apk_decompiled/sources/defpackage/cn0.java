package defpackage;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.Syntax;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class cn0 extends Message {
    public static final bn0 G = new bn0(FieldEncoding.LENGTH_DELIMITED, jce.a.b(cn0.class), "type.googleapis.com/anthropic.mobile.v1alpha.AppendMessageResponse", Syntax.PROTO_3, null, "anthropic/mobile/v1alpha/completion.proto");
    public final String E;
    public final k94 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn0(String str, k94 k94Var, ByteString byteString) {
        super(G, byteString);
        byteString.getClass();
        this.E = str;
        this.F = k94Var;
        if (Internal.countNonNull(str, k94Var) <= 1) {
            return;
        }
        sz6.p("At most one of completion_event_json, completion_event_error may be non-null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cn0)) {
            return false;
        }
        cn0 cn0Var = (cn0) obj;
        return x44.r(unknownFields(), cn0Var.unknownFields()) && x44.r(this.E, cn0Var.E) && x44.r(this.F, cn0Var.F);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.E;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        k94 k94Var = this.F;
        int iHashCode3 = iHashCode2 + (k94Var != null ? k94Var.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public final /* synthetic */ Message.Builder newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.E;
        if (str != null) {
            ms6.y("completion_event_json=", Internal.sanitize(str), arrayList);
        }
        k94 k94Var = this.F;
        if (k94Var != null) {
            arrayList.add("completion_event_error=" + k94Var);
        }
        return w44.S0(arrayList, ", ", "AppendMessageResponse{", "}", null, 56);
    }
}
