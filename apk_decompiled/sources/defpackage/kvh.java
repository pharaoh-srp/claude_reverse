package defpackage;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.Syntax;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class kvh extends Message {
    public static final hvh H = new hvh(FieldEncoding.LENGTH_DELIMITED, jce.a.b(kvh.class), "type.googleapis.com/anthropic.mobile.v1alpha.Tool", Syntax.PROTO_3, null, "anthropic/mobile/v1alpha/completion.proto");
    public final pi3 E;
    public final wy7 F;
    public final td0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kvh(pi3 pi3Var, wy7 wy7Var, td0 td0Var, ByteString byteString) {
        super(H, byteString);
        byteString.getClass();
        this.E = pi3Var;
        this.F = wy7Var;
        this.G = td0Var;
        if (Internal.countNonNull(pi3Var, wy7Var, td0Var) <= 1) {
            return;
        }
        sz6.p("At most one of claude_ai_tool, frontend_remote_mcp_tool, anthropic_tool may be non-null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kvh)) {
            return false;
        }
        kvh kvhVar = (kvh) obj;
        return x44.r(unknownFields(), kvhVar.unknownFields()) && x44.r(this.E, kvhVar.E) && x44.r(this.F, kvhVar.F) && x44.r(this.G, kvhVar.G);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        pi3 pi3Var = this.E;
        int iHashCode2 = (iHashCode + (pi3Var != null ? pi3Var.hashCode() : 0)) * 37;
        wy7 wy7Var = this.F;
        int iHashCode3 = (iHashCode2 + (wy7Var != null ? wy7Var.hashCode() : 0)) * 37;
        td0 td0Var = this.G;
        int iHashCode4 = iHashCode3 + (td0Var != null ? td0Var.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public final /* synthetic */ Message.Builder newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        ArrayList arrayList = new ArrayList();
        pi3 pi3Var = this.E;
        if (pi3Var != null) {
            arrayList.add("claude_ai_tool=" + pi3Var);
        }
        wy7 wy7Var = this.F;
        if (wy7Var != null) {
            arrayList.add("frontend_remote_mcp_tool=" + wy7Var);
        }
        td0 td0Var = this.G;
        if (td0Var != null) {
            arrayList.add("anthropic_tool=" + td0Var);
        }
        return w44.S0(arrayList, ", ", "Tool{", "}", null, 56);
    }
}
