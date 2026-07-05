package defpackage;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.Syntax;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class wy7 extends Message {
    public static final vy7 P = new vy7(FieldEncoding.LENGTH_DELIMITED, jce.a.b(wy7.class), "type.googleapis.com/anthropic.mobile.v1alpha.FrontendRemoteMcpTool", Syntax.PROTO_3, null, "anthropic/mobile/v1alpha/completion.proto");
    public final String E;
    public final String F;
    public final String G;
    public final String H;
    public final String I;
    public final String J;
    public final Boolean K;
    public final Boolean L;
    public final String M;
    public final Boolean N;
    public final Map O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy7(String str, String str2, Map map, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, Boolean bool3, ByteString byteString) {
        super(P, byteString);
        str.getClass();
        str2.getClass();
        byteString.getClass();
        this.E = str;
        this.F = str2;
        this.G = str3;
        this.H = str4;
        this.I = str5;
        this.J = str6;
        this.K = bool;
        this.L = bool2;
        this.M = str7;
        this.N = bool3;
        this.O = (Map) Internal.immutableCopyOfStruct("input_schema", map);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wy7)) {
            return false;
        }
        wy7 wy7Var = (wy7) obj;
        return x44.r(unknownFields(), wy7Var.unknownFields()) && x44.r(this.E, wy7Var.E) && x44.r(this.F, wy7Var.F) && x44.r(this.O, wy7Var.O) && x44.r(this.G, wy7Var.G) && x44.r(this.H, wy7Var.H) && x44.r(this.I, wy7Var.I) && x44.r(this.J, wy7Var.J) && x44.r(this.K, wy7Var.K) && x44.r(this.L, wy7Var.L) && x44.r(this.M, wy7Var.M) && x44.r(this.N, wy7Var.N);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iL = kgh.l(kgh.l(unknownFields().hashCode() * 37, 37, this.E), 37, this.F);
        Map map = this.O;
        int iHashCode = (iL + (map != null ? map.hashCode() : 0)) * 37;
        String str = this.G;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.H;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.I;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.J;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Boolean bool = this.K;
        int iHashCode6 = (iHashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.L;
        int iHashCode7 = (iHashCode6 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        String str5 = this.M;
        int iHashCode8 = (iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Boolean bool3 = this.N;
        int iHashCode9 = iHashCode8 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.squareup.wire.Message
    public final /* synthetic */ Message.Builder newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ms6.y("name=", Internal.sanitize(this.E), arrayList);
        ms6.y("description=", Internal.sanitize(this.F), arrayList);
        Map map = this.O;
        if (map != null) {
            arrayList.add("input_schema=" + map);
        }
        String str = this.G;
        if (str != null) {
            ms6.y("namespaced_name=", Internal.sanitize(str), arrayList);
        }
        String str2 = this.H;
        if (str2 != null) {
            ms6.y("mcp_server_uuid=", Internal.sanitize(str2), arrayList);
        }
        String str3 = this.I;
        if (str3 != null) {
            ms6.y("integration_name=", Internal.sanitize(str3), arrayList);
        }
        String str4 = this.J;
        if (str4 != null) {
            ms6.y("integration_icon_url=", Internal.sanitize(str4), arrayList);
        }
        Boolean bool = this.K;
        if (bool != null) {
            arrayList.add("needs_approval=" + bool);
        }
        Boolean bool2 = this.L;
        if (bool2 != null) {
            arrayList.add("backend_execution=" + bool2);
        }
        String str5 = this.M;
        if (str5 != null) {
            ms6.y("title=", Internal.sanitize(str5), arrayList);
        }
        Boolean bool3 = this.N;
        if (bool3 != null) {
            arrayList.add("read_only_hint=" + bool3);
        }
        return w44.S0(arrayList, ", ", "FrontendRemoteMcpTool{", "}", null, 56);
    }
}
