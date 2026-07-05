package defpackage;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.Syntax;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class n38 extends Message {
    public static final m38 N = new m38(FieldEncoding.LENGTH_DELIMITED, jce.a.b(n38.class), "type.googleapis.com/anthropic.mobile.v1alpha.GetConversationRequest", Syntax.PROTO_3, null, "anthropic/mobile/v1alpha/completion.proto");
    public final String E;
    public final String F;
    public final String G;
    public final Boolean H;
    public final tl3 I;
    public final Boolean J;
    public final Boolean K;
    public final String L;
    public final Boolean M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n38(String str, String str2, String str3, Boolean bool, tl3 tl3Var, Boolean bool2, Boolean bool3, String str4, Boolean bool4, ByteString byteString) {
        super(N, byteString);
        str.getClass();
        str2.getClass();
        byteString.getClass();
        this.E = str;
        this.F = str2;
        this.G = str3;
        this.H = bool;
        this.I = tl3Var;
        this.J = bool2;
        this.K = bool3;
        this.L = str4;
        this.M = bool4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n38)) {
            return false;
        }
        n38 n38Var = (n38) obj;
        return x44.r(unknownFields(), n38Var.unknownFields()) && x44.r(this.E, n38Var.E) && x44.r(this.F, n38Var.F) && x44.r(this.G, n38Var.G) && x44.r(this.H, n38Var.H) && this.I == n38Var.I && x44.r(this.J, n38Var.J) && x44.r(this.K, n38Var.K) && x44.r(this.L, n38Var.L) && x44.r(this.M, n38Var.M);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iL = kgh.l(kgh.l(unknownFields().hashCode() * 37, 37, this.E), 37, this.F);
        String str = this.G;
        int iHashCode = (iL + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.H;
        int iHashCode2 = (iHashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        tl3 tl3Var = this.I;
        int iHashCode3 = (iHashCode2 + (tl3Var != null ? tl3Var.hashCode() : 0)) * 37;
        Boolean bool2 = this.J;
        int iHashCode4 = (iHashCode3 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.K;
        int iHashCode5 = (iHashCode4 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        String str2 = this.L;
        int iHashCode6 = (iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool4 = this.M;
        int iHashCode7 = iHashCode6 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public final /* synthetic */ Message.Builder newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ms6.y("organization_uuid=", Internal.sanitize(this.E), arrayList);
        ms6.y("chat_conversation_uuid=", Internal.sanitize(this.F), arrayList);
        String str = this.G;
        if (str != null) {
            ms6.y("workspace_id=", Internal.sanitize(str), arrayList);
        }
        Boolean bool = this.H;
        if (bool != null) {
            arrayList.add("tree=" + bool);
        }
        tl3 tl3Var = this.I;
        if (tl3Var != null) {
            arrayList.add("rendering_mode=" + tl3Var);
        }
        Boolean bool2 = this.J;
        if (bool2 != null) {
            arrayList.add("render_all_tools=" + bool2);
        }
        Boolean bool3 = this.K;
        if (bool3 != null) {
            arrayList.add("render_all_mobile_tools=" + bool3);
        }
        String str2 = this.L;
        if (str2 != null) {
            ms6.y("tools=", Internal.sanitize(str2), arrayList);
        }
        Boolean bool4 = this.M;
        if (bool4 != null) {
            arrayList.add("return_dangling_human_message=" + bool4);
        }
        return w44.S0(arrayList, ", ", "GetConversationRequest{", "}", null, 56);
    }
}
