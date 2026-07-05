package defpackage;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.Syntax;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class an0 extends Message {
    public static final zm0 e0 = new zm0(FieldEncoding.LENGTH_DELIMITED, jce.a.b(an0.class), "type.googleapis.com/anthropic.mobile.v1alpha.AppendMessageRequest", Syntax.PROTO_3, null, "anthropic/mobile/v1alpha/completion.proto");
    public final String E;
    public final String F;
    public final String G;
    public final String H;
    public final Boolean I;
    public final String J;
    public final Integer K;
    public final Float L;
    public final Integer M;
    public final Float N;
    public final String O;
    public final String P;
    public final String Q;
    public final String R;
    public final tl3 S;
    public final Boolean T;
    public final Boolean U;
    public final String V;
    public final Boolean W;
    public final String X;
    public final y8i Y;
    public final List Z;
    public final List a0;
    public final List b0;
    public final List c0;
    public final List d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an0(String str, String str2, String str3, String str4, Boolean bool, List list, String str5, Integer num, Float f, Integer num2, Float f2, String str6, String str7, String str8, String str9, tl3 tl3Var, Boolean bool2, Boolean bool3, String str10, List list2, List list3, List list4, List list5, Boolean bool4, String str11, y8i y8iVar, ByteString byteString) {
        super(e0, byteString);
        str.getClass();
        str2.getClass();
        str3.getClass();
        list3.getClass();
        list4.getClass();
        byteString.getClass();
        this.E = str;
        this.F = str2;
        this.G = str3;
        this.H = str4;
        this.I = bool;
        this.J = str5;
        this.K = num;
        this.L = f;
        this.M = num2;
        this.N = f2;
        this.O = str6;
        this.P = str7;
        this.Q = str8;
        this.R = str9;
        this.S = tl3Var;
        this.T = bool2;
        this.U = bool3;
        this.V = str10;
        this.W = bool4;
        this.X = str11;
        this.Y = y8iVar;
        this.Z = Internal.immutableCopyOf("tools", list);
        this.a0 = Internal.immutableCopyOf("attachments", list2);
        this.b0 = Internal.immutableCopyOf("files", list3);
        this.c0 = Internal.immutableCopyOf("sync_sources", list4);
        this.d0 = Internal.immutableCopyOf("personalized_styles", list5);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof an0)) {
            return false;
        }
        an0 an0Var = (an0) obj;
        return x44.r(unknownFields(), an0Var.unknownFields()) && x44.r(this.E, an0Var.E) && x44.r(this.F, an0Var.F) && x44.r(this.G, an0Var.G) && x44.r(this.H, an0Var.H) && x44.r(this.I, an0Var.I) && x44.r(this.Z, an0Var.Z) && x44.r(this.J, an0Var.J) && x44.r(this.K, an0Var.K) && x44.q(this.L, an0Var.L) && x44.r(this.M, an0Var.M) && x44.q(this.N, an0Var.N) && x44.r(this.O, an0Var.O) && x44.r(this.P, an0Var.P) && x44.r(this.Q, an0Var.Q) && x44.r(this.R, an0Var.R) && this.S == an0Var.S && x44.r(this.T, an0Var.T) && x44.r(this.U, an0Var.U) && x44.r(this.V, an0Var.V) && x44.r(this.a0, an0Var.a0) && x44.r(this.b0, an0Var.b0) && x44.r(this.c0, an0Var.c0) && x44.r(this.d0, an0Var.d0) && x44.r(this.W, an0Var.W) && x44.r(this.X, an0Var.X) && x44.r(this.Y, an0Var.Y);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iL = kgh.l(kgh.l(kgh.l(unknownFields().hashCode() * 37, 37, this.E), 37, this.F), 37, this.G);
        String str = this.H;
        int iHashCode = (iL + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.I;
        int iM = kgh.m((iHashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37, 37, this.Z);
        String str2 = this.J;
        int iHashCode2 = (iM + (str2 != null ? str2.hashCode() : 0)) * 37;
        Integer num = this.K;
        int iHashCode3 = (iHashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Float f = this.L;
        int iHashCode4 = (iHashCode3 + (f != null ? Float.hashCode(f.floatValue()) : 0)) * 37;
        Integer num2 = this.M;
        int iHashCode5 = (iHashCode4 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        Float f2 = this.N;
        int iHashCode6 = (iHashCode5 + (f2 != null ? Float.hashCode(f2.floatValue()) : 0)) * 37;
        String str3 = this.O;
        int iHashCode7 = (iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.P;
        int iHashCode8 = (iHashCode7 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.Q;
        int iHashCode9 = (iHashCode8 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.R;
        int iHashCode10 = (iHashCode9 + (str6 != null ? str6.hashCode() : 0)) * 37;
        tl3 tl3Var = this.S;
        int iHashCode11 = (iHashCode10 + (tl3Var != null ? tl3Var.hashCode() : 0)) * 37;
        Boolean bool2 = this.T;
        int iHashCode12 = (iHashCode11 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.U;
        int iHashCode13 = (iHashCode12 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        String str7 = this.V;
        int iM2 = kgh.m(kgh.m(kgh.m(kgh.m((iHashCode13 + (str7 != null ? str7.hashCode() : 0)) * 37, 37, this.a0), 37, this.b0), 37, this.c0), 37, this.d0);
        Boolean bool4 = this.W;
        int iHashCode14 = (iM2 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37;
        String str8 = this.X;
        int iHashCode15 = (iHashCode14 + (str8 != null ? str8.hashCode() : 0)) * 37;
        y8i y8iVar = this.Y;
        int iHashCode16 = iHashCode15 + (y8iVar != null ? y8iVar.hashCode() : 0);
        this.hashCode = iHashCode16;
        return iHashCode16;
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
        ms6.y("prompt=", Internal.sanitize(this.G), arrayList);
        String str = this.H;
        if (str != null) {
            ms6.y("workspace_id=", Internal.sanitize(str), arrayList);
        }
        Boolean bool = this.I;
        if (bool != null) {
            arrayList.add("use_all_available_tools=" + bool);
        }
        List list = this.Z;
        if (!list.isEmpty()) {
            arrayList.add("tools=" + list);
        }
        String str2 = this.J;
        if (str2 != null) {
            ms6.y("model=", Internal.sanitize(str2), arrayList);
        }
        Integer num = this.K;
        if (num != null) {
            arrayList.add("max_tokens_to_sample=" + num);
        }
        Float f = this.L;
        if (f != null) {
            arrayList.add("temperature=" + f);
        }
        Integer num2 = this.M;
        if (num2 != null) {
            arrayList.add("top_k=" + num2);
        }
        Float f2 = this.N;
        if (f2 != null) {
            arrayList.add("top_p=" + f2);
        }
        String str3 = this.O;
        if (str3 != null) {
            ms6.y("timezone=", Internal.sanitize(str3), arrayList);
        }
        String str4 = this.P;
        if (str4 != null) {
            ms6.y("custom_system_prompt=", Internal.sanitize(str4), arrayList);
        }
        String str5 = this.Q;
        if (str5 != null) {
            ms6.y("parent_message_uuid=", Internal.sanitize(str5), arrayList);
        }
        String str6 = this.R;
        if (str6 != null) {
            ms6.y("input_mode=", Internal.sanitize(str6), arrayList);
        }
        tl3 tl3Var = this.S;
        if (tl3Var != null) {
            arrayList.add("rendering_mode=" + tl3Var);
        }
        Boolean bool2 = this.T;
        if (bool2 != null) {
            arrayList.add("is_mobile_app_intent=" + bool2);
        }
        Boolean bool3 = this.U;
        if (bool3 != null) {
            arrayList.add("is_voice_input=" + bool3);
        }
        String str7 = this.V;
        if (str7 != null) {
            ms6.y("locale=", Internal.sanitize(str7), arrayList);
        }
        List list2 = this.a0;
        if (!list2.isEmpty()) {
            arrayList.add("attachments=" + list2);
        }
        List list3 = this.b0;
        if (!list3.isEmpty()) {
            ms6.y("files=", Internal.sanitize((List<String>) list3), arrayList);
        }
        List list4 = this.c0;
        if (!list4.isEmpty()) {
            ms6.y("sync_sources=", Internal.sanitize((List<String>) list4), arrayList);
        }
        List list5 = this.d0;
        if (!list5.isEmpty()) {
            arrayList.add("personalized_styles=" + list5);
        }
        Boolean bool4 = this.W;
        if (bool4 != null) {
            arrayList.add("enable_process_group_markers=" + bool4);
        }
        String str8 = this.X;
        if (str8 != null) {
            ms6.y("device_location=", Internal.sanitize(str8), arrayList);
        }
        y8i y8iVar = this.Y;
        if (y8iVar != null) {
            arrayList.add("turn_message_uuids=" + y8iVar);
        }
        return w44.S0(arrayList, ", ", "AppendMessageRequest{", "}", null, 56);
    }
}
