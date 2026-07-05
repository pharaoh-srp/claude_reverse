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
import java.time.Instant;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 32\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00013BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010$\u001a\u00020\u0002H\u0017b\u0018\b%\u0012\b\b&\u0012\u0004\b\b('\u0012\n\b(\u0012\u0006\b\n0)8*J\u0014\u0010+\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010-H\u0096\u0082\u0004J\n\u0010.\u001a\u00020/H\u0096\u0080\u0004J\b\u00100\u001a\u00020\u0004H\u0016J]\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u00102RE\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u0092\u0002,\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0002\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\n\b\u0017\u0012\u0006\b\n0\u00188\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012RE\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u0092\u0002,\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0004\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\n\b\u0017\u0012\u0006\b\n0\u00188\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012RE\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004\u0092\u0002,\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0006\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\n\b\u0017\u0012\u0006\b\n0\u00188\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012RA\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006X\u0087\u0004\u0092\u0002 \b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\b\u0012\b\b\u0015\u0012\u0004\b\b(\u001f\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR;\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u0092\u0002 \b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\n\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0012R=\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u0092\u0002 \b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\f\u0012\b\b\u0015\u0012\u0004\b\b(#\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\n¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b\u000b\u0010!¨\u00064"}, d2 = {"Lcom/anthropic/claude/protos/push/OpenChatRequest;", "Lcom/squareup/wire/Message;", "", "account_uuid", "", "organization_uuid", "conversation_uuid", "sampling_completed_timestamp", "Ljava/time/Instant;", "Lcom/squareup/wire/Instant;", "message_uuid", "is_temporary", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/Instant;Ljava/lang/String;Ljava/lang/Boolean;Lokio/ByteString;)V", "getAccount_uuid", "()Ljava/lang/String;", "Lcom/squareup/wire/WireField;", "tag", "adapter", "com.squareup.wire.ProtoAdapter#STRING", "label", "Lcom/squareup/wire/WireField$Label;", "OMIT_IDENTITY", "schemaIndex", "getOrganization_uuid", "getConversation_uuid", "getSampling_completed_timestamp", "()Ljava/time/Instant;", "com.squareup.wire.ProtoAdapter#INSTANT", "getMessage_uuid", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "com.squareup.wire.ProtoAdapter#BOOL", "newBuilder", "Lkotlin/Deprecated;", "message", "Shouldn't be used in Kotlin", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/Instant;Ljava/lang/String;Ljava/lang/Boolean;Lokio/ByteString;)Lcom/anthropic/claude/protos/push/OpenChatRequest;", "Companion", "Claude:protos"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class OpenChatRequest extends Message {
    public static final ProtoAdapter<OpenChatRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_uuid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String conversation_uuid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 5, tag = 6)
    private final Boolean is_temporary;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    private final String message_uuid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String organization_uuid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", schemaIndex = 3, tag = 4)
    private final Instant sampling_completed_timestamp;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final pl9 pl9VarB = jce.a.b(OpenChatRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OpenChatRequest>(fieldEncoding, pl9VarB, syntax) { // from class: com.anthropic.claude.protos.push.OpenChatRequest$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OpenChatRequest decode(ProtoReader reader) {
                reader.getClass();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                Instant instantDecode = null;
                String strDecode3 = null;
                Boolean boolDecode = null;
                String strDecode4 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new OpenChatRequest(strDecode, strDecode4, strDecode2, instantDecode, strDecode3, boolDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    switch (iNextTag) {
                        case 1:
                            strDecode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            strDecode4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            instantDecode = ProtoAdapter.INSTANT.decode(reader);
                            break;
                        case 5:
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            boolDecode = ProtoAdapter.BOOL.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(iNextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OpenChatRequest value) {
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
                ProtoAdapter.INSTANT.encodeWithTag(writer, 4, value.getSampling_completed_timestamp());
                ProtoAdapter.STRING.encodeWithTag(writer, 5, value.getMessage_uuid());
                ProtoAdapter.BOOL.encodeWithTag(writer, 6, value.getIs_temporary());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OpenChatRequest value) {
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
                return ProtoAdapter.BOOL.encodedSizeWithTag(6, value.getIs_temporary()) + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getMessage_uuid()) + ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getSampling_completed_timestamp()) + iE;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OpenChatRequest redact(OpenChatRequest value) {
                value.getClass();
                Instant sampling_completed_timestamp = value.getSampling_completed_timestamp();
                return OpenChatRequest.copy$default(value, null, null, null, sampling_completed_timestamp != null ? ProtoAdapter.INSTANT.redact(sampling_completed_timestamp) : null, null, null, ByteString.H, 55, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OpenChatRequest value) throws EOFException {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(writer, 6, value.getIs_temporary());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 5, value.getMessage_uuid());
                ProtoAdapter.INSTANT.encodeWithTag(writer, 4, value.getSampling_completed_timestamp());
                if (!x44.r(value.getConversation_uuid(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, value.getConversation_uuid());
                }
                if (!x44.r(value.getOrganization_uuid(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, value.getOrganization_uuid());
                }
                if (x44.r(value.getAccount_uuid(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, value.getAccount_uuid());
            }
        };
    }

    public /* synthetic */ OpenChatRequest(String str, String str2, String str3, Instant instant, String str4, Boolean bool, ByteString byteString, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? ByteString.H : byteString);
    }

    public static /* synthetic */ OpenChatRequest copy$default(OpenChatRequest openChatRequest, String str, String str2, String str3, Instant instant, String str4, Boolean bool, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openChatRequest.account_uuid;
        }
        if ((i & 2) != 0) {
            str2 = openChatRequest.organization_uuid;
        }
        if ((i & 4) != 0) {
            str3 = openChatRequest.conversation_uuid;
        }
        if ((i & 8) != 0) {
            instant = openChatRequest.sampling_completed_timestamp;
        }
        if ((i & 16) != 0) {
            str4 = openChatRequest.message_uuid;
        }
        if ((i & 32) != 0) {
            bool = openChatRequest.is_temporary;
        }
        if ((i & 64) != 0) {
            byteString = openChatRequest.unknownFields();
        }
        Boolean bool2 = bool;
        ByteString byteString2 = byteString;
        String str5 = str4;
        String str6 = str3;
        return openChatRequest.copy(str, str2, str6, instant, str5, bool2, byteString2);
    }

    public final OpenChatRequest copy(String account_uuid, String organization_uuid, String conversation_uuid, Instant sampling_completed_timestamp, String message_uuid, Boolean is_temporary, ByteString unknownFields) {
        account_uuid.getClass();
        organization_uuid.getClass();
        conversation_uuid.getClass();
        unknownFields.getClass();
        return new OpenChatRequest(account_uuid, organization_uuid, conversation_uuid, sampling_completed_timestamp, message_uuid, is_temporary, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OpenChatRequest)) {
            return false;
        }
        OpenChatRequest openChatRequest = (OpenChatRequest) other;
        return x44.r(unknownFields(), openChatRequest.unknownFields()) && x44.r(this.account_uuid, openChatRequest.account_uuid) && x44.r(this.organization_uuid, openChatRequest.organization_uuid) && x44.r(this.conversation_uuid, openChatRequest.conversation_uuid) && x44.r(this.sampling_completed_timestamp, openChatRequest.sampling_completed_timestamp) && x44.r(this.message_uuid, openChatRequest.message_uuid) && x44.r(this.is_temporary, openChatRequest.is_temporary);
    }

    public final String getAccount_uuid() {
        return this.account_uuid;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    public final String getMessage_uuid() {
        return this.message_uuid;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final Instant getSampling_completed_timestamp() {
        return this.sampling_completed_timestamp;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iL = kgh.l(kgh.l(kgh.l(unknownFields().hashCode() * 37, 37, this.account_uuid), 37, this.organization_uuid), 37, this.conversation_uuid);
        Instant instant = this.sampling_completed_timestamp;
        int iHashCode = (iL + (instant != null ? instant.hashCode() : 0)) * 37;
        String str = this.message_uuid;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.is_temporary;
        int iHashCode3 = iHashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    /* JADX INFO: renamed from: is_temporary, reason: from getter */
    public final Boolean getIs_temporary() {
        return this.is_temporary;
    }

    @lz5
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m811newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ms6.y("account_uuid=", Internal.sanitize(this.account_uuid), arrayList);
        ms6.y("organization_uuid=", Internal.sanitize(this.organization_uuid), arrayList);
        ms6.y("conversation_uuid=", Internal.sanitize(this.conversation_uuid), arrayList);
        Instant instant = this.sampling_completed_timestamp;
        if (instant != null) {
            arrayList.add("sampling_completed_timestamp=" + instant);
        }
        String str = this.message_uuid;
        if (str != null) {
            ms6.y("message_uuid=", Internal.sanitize(str), arrayList);
        }
        Boolean bool = this.is_temporary;
        if (bool != null) {
            arrayList.add("is_temporary=" + bool);
        }
        return w44.S0(arrayList, ", ", "OpenChatRequest{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    @lz5
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m811newBuilder();
    }

    public OpenChatRequest() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenChatRequest(String str, String str2, String str3, Instant instant, String str4, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        str2.getClass();
        str3.getClass();
        byteString.getClass();
        this.account_uuid = str;
        this.organization_uuid = str2;
        this.conversation_uuid = str3;
        this.sampling_completed_timestamp = instant;
        this.message_uuid = str4;
        this.is_temporary = bool;
    }
}
