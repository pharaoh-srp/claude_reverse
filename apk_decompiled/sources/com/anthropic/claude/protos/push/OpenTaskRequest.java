package com.anthropic.claude.protos.push;

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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u0019\u001a\u00020\u0002H\u0017b\u0018\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\n\b\u001d\u0012\u0006\b\n0\u001e8\u001fJ\u0014\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0082\u0004J\n\u0010$\u001a\u00020%H\u0096\u0080\u0004J\b\u0010&\u001a\u00020\u0004H\u0016J8\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tRE\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u0092\u0002,\b\u000e\u0012\b\b\u000f\u0012\u0004\b\u0003\u0010\u0002\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\b\u0012\u0012\u0006\b\n0\u00138\u0014\u0012\b\b\u0015\u0012\u0004\b\u0003\u0010\u0000¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rRE\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u0092\u0002,\b\u000e\u0012\b\b\u000f\u0012\u0004\b\u0003\u0010\u0004\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\b\u0012\u0012\u0006\b\n0\u00138\u0014\u0012\b\b\u0015\u0012\u0004\b\u0003\u0010\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\rRE\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004\u0092\u0002,\b\u000e\u0012\b\b\u000f\u0012\u0004\b\u0003\u0010\u0006\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\b\u0012\u0012\u0006\b\n0\u00138\u0014\u0012\b\b\u0015\u0012\u0004\b\u0003\u0010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\rRE\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004\u0092\u0002,\b\u000e\u0012\b\b\u000f\u0012\u0004\b\u0003\u0010\b\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\b\u0012\u0012\u0006\b\n0\u00138\u0014\u0012\b\b\u0015\u0012\u0004\b\u0003\u0010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\r¨\u0006)"}, d2 = {"Lcom/anthropic/claude/protos/push/OpenTaskRequest;", "Lcom/squareup/wire/Message;", "", "account_uuid", "", "organization_uuid", "conversation_uuid", "task_uuid", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getAccount_uuid", "()Ljava/lang/String;", "Lcom/squareup/wire/WireField;", "tag", "adapter", "com.squareup.wire.ProtoAdapter#STRING", "label", "Lcom/squareup/wire/WireField$Label;", "OMIT_IDENTITY", "schemaIndex", "getOrganization_uuid", "getConversation_uuid", "getTask_uuid", "newBuilder", "Lkotlin/Deprecated;", "message", "Shouldn't be used in Kotlin", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Claude:protos"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class OpenTaskRequest extends Message {
    public static final ProtoAdapter<OpenTaskRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_uuid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String conversation_uuid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String organization_uuid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String task_uuid;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final pl9 pl9VarB = jce.a.b(OpenTaskRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OpenTaskRequest>(fieldEncoding, pl9VarB, syntax) { // from class: com.anthropic.claude.protos.push.OpenTaskRequest$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OpenTaskRequest decode(ProtoReader reader) {
                reader.getClass();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new OpenTaskRequest(strDecode, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag != 4) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OpenTaskRequest value) {
                writer.getClass();
                value.getClass();
                if (!x44.r(value.getAccount_uuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getAccount_uuid());
                }
                if (!x44.r(value.getOrganization_uuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getOrganization_uuid());
                }
                if (!x44.r(value.getConversation_uuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, value.getConversation_uuid());
                }
                if (!x44.r(value.getTask_uuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, value.getTask_uuid());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OpenTaskRequest value) {
                value.getClass();
                int iE = value.unknownFields().e();
                if (!x44.r(value.getAccount_uuid(), "")) {
                    iE += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_uuid());
                }
                if (!x44.r(value.getOrganization_uuid(), "")) {
                    iE += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getOrganization_uuid());
                }
                if (!x44.r(value.getConversation_uuid(), "")) {
                    iE += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getConversation_uuid());
                }
                return !x44.r(value.getTask_uuid(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.getTask_uuid()) + iE : iE;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OpenTaskRequest redact(OpenTaskRequest value) {
                value.getClass();
                return OpenTaskRequest.copy$default(value, null, null, null, null, ByteString.H, 15, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OpenTaskRequest value) throws EOFException {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                if (!x44.r(value.getTask_uuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, value.getTask_uuid());
                }
                if (!x44.r(value.getConversation_uuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, value.getConversation_uuid());
                }
                if (!x44.r(value.getOrganization_uuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getOrganization_uuid());
                }
                if (x44.r(value.getAccount_uuid(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getAccount_uuid());
            }
        };
    }

    public /* synthetic */ OpenTaskRequest(String str, String str2, String str3, String str4, ByteString byteString, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? ByteString.H : byteString);
    }

    public static /* synthetic */ OpenTaskRequest copy$default(OpenTaskRequest openTaskRequest, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openTaskRequest.account_uuid;
        }
        if ((i & 2) != 0) {
            str2 = openTaskRequest.organization_uuid;
        }
        if ((i & 4) != 0) {
            str3 = openTaskRequest.conversation_uuid;
        }
        if ((i & 8) != 0) {
            str4 = openTaskRequest.task_uuid;
        }
        if ((i & 16) != 0) {
            byteString = openTaskRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str5 = str3;
        return openTaskRequest.copy(str, str2, str5, str4, byteString2);
    }

    public final OpenTaskRequest copy(String account_uuid, String organization_uuid, String conversation_uuid, String task_uuid, ByteString unknownFields) {
        account_uuid.getClass();
        organization_uuid.getClass();
        conversation_uuid.getClass();
        task_uuid.getClass();
        unknownFields.getClass();
        return new OpenTaskRequest(account_uuid, organization_uuid, conversation_uuid, task_uuid, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OpenTaskRequest)) {
            return false;
        }
        OpenTaskRequest openTaskRequest = (OpenTaskRequest) other;
        return x44.r(unknownFields(), openTaskRequest.unknownFields()) && x44.r(this.account_uuid, openTaskRequest.account_uuid) && x44.r(this.organization_uuid, openTaskRequest.organization_uuid) && x44.r(this.conversation_uuid, openTaskRequest.conversation_uuid) && x44.r(this.task_uuid, openTaskRequest.task_uuid);
    }

    public final String getAccount_uuid() {
        return this.account_uuid;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getTask_uuid() {
        return this.task_uuid;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.task_uuid.hashCode() + kgh.l(kgh.l(kgh.l(unknownFields().hashCode() * 37, 37, this.account_uuid), 37, this.organization_uuid), 37, this.conversation_uuid);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @lz5
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m816newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ms6.y("account_uuid=", Internal.sanitize(this.account_uuid), arrayList);
        ms6.y("organization_uuid=", Internal.sanitize(this.organization_uuid), arrayList);
        ms6.y("conversation_uuid=", Internal.sanitize(this.conversation_uuid), arrayList);
        ms6.y("task_uuid=", Internal.sanitize(this.task_uuid), arrayList);
        return w44.S0(arrayList, ", ", "OpenTaskRequest{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    @lz5
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m816newBuilder();
    }

    public OpenTaskRequest() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenTaskRequest(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        byteString.getClass();
        this.account_uuid = str;
        this.organization_uuid = str2;
        this.conversation_uuid = str3;
        this.task_uuid = str4;
    }
}
