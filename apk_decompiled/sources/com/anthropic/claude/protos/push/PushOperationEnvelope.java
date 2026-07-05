package com.anthropic.claude.protos.push;

import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import com.squareup.wire.AnyMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import defpackage.jce;
import defpackage.kgh;
import defpackage.lz5;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.ms6;
import defpackage.pl9;
import defpackage.w44;
import defpackage.x44;
import java.io.EOFException;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u001a\u001a\u00020\u0002H\u0017b\u0018\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\n\b\u001e\u0012\u0006\b\n0\u001f8 J\u0014\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0082\u0004J\n\u0010%\u001a\u00020&H\u0096\u0080\u0004J\b\u0010'\u001a\u00020\u0004H\u0016J0\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tRE\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u0092\u0002,\b\u000e\u0012\b\b\u000f\u0012\u0004\b\u0003\u0010\u0002\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\b\u0012\u0012\u0006\b\n0\u00138\u0014\u0012\b\b\u0015\u0012\u0004\b\u0003\u0010\u0000¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rRE\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u0092\u0002,\b\u000e\u0012\b\b\u000f\u0012\u0004\b\u0003\u0010\u0004\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\b\u0012\u0012\u0006\b\n0\u00138\u0014\u0012\b\b\u0015\u0012\u0004\b\u0003\u0010\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\rRG\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002,\b\u000e\u0012\b\b\u000f\u0012\u0004\b\u0003\u0010\u0006\u0012\b\b\u0010\u0012\u0004\b\b(\u0019\u0012\n\b\u0012\u0012\u0006\b\n0\u00138\u0014\u0012\b\b\u0015\u0012\u0004\b\u0003\u0010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006*"}, d2 = {"Lcom/anthropic/claude/protos/push/PushOperationEnvelope;", "Lcom/squareup/wire/Message;", "", "service", "", VerifyMagicLinkRequest.Credentials.DISCRIMINATOR, "request", "Lcom/squareup/wire/AnyMessage;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/wire/AnyMessage;Lokio/ByteString;)V", "getService", "()Ljava/lang/String;", "Lcom/squareup/wire/WireField;", "tag", "adapter", "com.squareup.wire.ProtoAdapter#STRING", "label", "Lcom/squareup/wire/WireField$Label;", "OMIT_IDENTITY", "schemaIndex", "getMethod", "getRequest", "()Lcom/squareup/wire/AnyMessage;", "com.squareup.wire.AnyMessage#ADAPTER", "newBuilder", "Lkotlin/Deprecated;", "message", "Shouldn't be used in Kotlin", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Claude:protos"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class PushOperationEnvelope extends Message {
    public static final ProtoAdapter<PushOperationEnvelope> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String method;

    @WireField(adapter = "com.squareup.wire.AnyMessage#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final AnyMessage request;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String service;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final pl9 pl9VarB = jce.a.b(PushOperationEnvelope.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PushOperationEnvelope>(fieldEncoding, pl9VarB, syntax) { // from class: com.anthropic.claude.protos.push.PushOperationEnvelope$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PushOperationEnvelope decode(ProtoReader reader) {
                reader.getClass();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                AnyMessage anyMessageDecode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PushOperationEnvelope(strDecode, strDecode2, anyMessageDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag != 3) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        anyMessageDecode = AnyMessage.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PushOperationEnvelope value) {
                writer.getClass();
                value.getClass();
                if (!x44.r(value.getService(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getService());
                }
                if (!x44.r(value.getMethod(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getMethod());
                }
                if (value.getRequest() != null) {
                    AnyMessage.ADAPTER.encodeWithTag(writer, 3, value.getRequest());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PushOperationEnvelope value) {
                value.getClass();
                int iE = value.unknownFields().e();
                if (!x44.r(value.getService(), "")) {
                    iE += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getService());
                }
                if (!x44.r(value.getMethod(), "")) {
                    iE += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getMethod());
                }
                return value.getRequest() != null ? AnyMessage.ADAPTER.encodedSizeWithTag(3, value.getRequest()) + iE : iE;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PushOperationEnvelope redact(PushOperationEnvelope value) {
                value.getClass();
                AnyMessage request = value.getRequest();
                return PushOperationEnvelope.copy$default(value, null, null, request != null ? AnyMessage.ADAPTER.redact(request) : null, ByteString.H, 3, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PushOperationEnvelope value) throws EOFException {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                if (value.getRequest() != null) {
                    AnyMessage.ADAPTER.encodeWithTag(writer, 3, value.getRequest());
                }
                if (!x44.r(value.getMethod(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getMethod());
                }
                if (x44.r(value.getService(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getService());
            }
        };
    }

    public /* synthetic */ PushOperationEnvelope(String str, String str2, AnyMessage anyMessage, ByteString byteString, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : anyMessage, (i & 8) != 0 ? ByteString.H : byteString);
    }

    public static /* synthetic */ PushOperationEnvelope copy$default(PushOperationEnvelope pushOperationEnvelope, String str, String str2, AnyMessage anyMessage, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pushOperationEnvelope.service;
        }
        if ((i & 2) != 0) {
            str2 = pushOperationEnvelope.method;
        }
        if ((i & 4) != 0) {
            anyMessage = pushOperationEnvelope.request;
        }
        if ((i & 8) != 0) {
            byteString = pushOperationEnvelope.unknownFields();
        }
        return pushOperationEnvelope.copy(str, str2, anyMessage, byteString);
    }

    public final PushOperationEnvelope copy(String service, String method, AnyMessage request, ByteString unknownFields) {
        service.getClass();
        method.getClass();
        unknownFields.getClass();
        return new PushOperationEnvelope(service, method, request, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PushOperationEnvelope)) {
            return false;
        }
        PushOperationEnvelope pushOperationEnvelope = (PushOperationEnvelope) other;
        return x44.r(unknownFields(), pushOperationEnvelope.unknownFields()) && x44.r(this.service, pushOperationEnvelope.service) && x44.r(this.method, pushOperationEnvelope.method) && x44.r(this.request, pushOperationEnvelope.request);
    }

    public final String getMethod() {
        return this.method;
    }

    public final AnyMessage getRequest() {
        return this.request;
    }

    public final String getService() {
        return this.service;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iL = kgh.l(kgh.l(unknownFields().hashCode() * 37, 37, this.service), 37, this.method);
        AnyMessage anyMessage = this.request;
        int iHashCode = iL + (anyMessage != null ? anyMessage.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @lz5
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m817newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ms6.y("service=", Internal.sanitize(this.service), arrayList);
        ms6.y("method=", Internal.sanitize(this.method), arrayList);
        AnyMessage anyMessage = this.request;
        if (anyMessage != null) {
            arrayList.add("request=" + anyMessage);
        }
        return w44.S0(arrayList, ", ", "PushOperationEnvelope{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    @lz5
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m817newBuilder();
    }

    public PushOperationEnvelope() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushOperationEnvelope(String str, String str2, AnyMessage anyMessage, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        str2.getClass();
        byteString.getClass();
        this.service = str;
        this.method = str2;
        this.request = anyMessage;
    }
}
