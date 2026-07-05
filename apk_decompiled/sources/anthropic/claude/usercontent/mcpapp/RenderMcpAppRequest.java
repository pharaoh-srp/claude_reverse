package anthropic.claude.usercontent.mcpapp;

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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u001d\u001a\u00020\u0002H\u0017b\u0018\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\n\b!\u0012\u0006\b\n0\"8#J\u0014\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0082\u0004J\n\u0010(\u001a\u00020)H\u0096\u0080\u0004J\b\u0010*\u001a\u00020\u0004H\u0016JP\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bRE\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u0092\u0002,\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\b\u0014\u0012\u0006\b\n0\u00158\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fRE\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u0092\u0002,\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0004\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\b\u0014\u0012\u0006\b\n0\u00158\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fRE\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004\u0092\u0002,\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0006\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\b\u0014\u0012\u0006\b\n0\u00158\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fRE\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004\u0092\u0002,\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\b\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\b\u0014\u0012\u0006\b\n0\u00158\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000fR;\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u0092\u0002 \b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\n\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000fR;\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u0092\u0002 \b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\f\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000f¨\u0006-"}, d2 = {"Lanthropic/claude/usercontent/mcpapp/RenderMcpAppRequest;", "Lcom/squareup/wire/Message;", "", "conversation_uuid", "", "server_uuid", "sandbox_url_query", "server_name", "ui_domain", "connector_url", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getConversation_uuid", "()Ljava/lang/String;", "Lcom/squareup/wire/WireField;", "tag", "adapter", "com.squareup.wire.ProtoAdapter#STRING", "label", "Lcom/squareup/wire/WireField$Label;", "OMIT_IDENTITY", "schemaIndex", "getServer_uuid", "getSandbox_url_query", "getServer_name", "getUi_domain", "getConnector_url", "newBuilder", "Lkotlin/Deprecated;", "message", "Shouldn't be used in Kotlin", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Claude:protos"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class RenderMcpAppRequest extends Message {
    public static final ProtoAdapter<RenderMcpAppRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    private final String connector_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String conversation_uuid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String sandbox_url_query;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String server_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String server_uuid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    private final String ui_domain;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final pl9 pl9VarB = jce.a.b(RenderMcpAppRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RenderMcpAppRequest>(fieldEncoding, pl9VarB, syntax) { // from class: anthropic.claude.usercontent.mcpapp.RenderMcpAppRequest$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public RenderMcpAppRequest decode(ProtoReader reader) {
                reader.getClass();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = null;
                String strDecode5 = null;
                String strDecode6 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new RenderMcpAppRequest(strDecode, strDecode6, strDecode2, strDecode3, strDecode4, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    switch (iNextTag) {
                        case 1:
                            strDecode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            strDecode6 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            strDecode4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            strDecode5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(iNextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RenderMcpAppRequest value) {
                writer.getClass();
                value.getClass();
                if (!x44.r(value.getConversation_uuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getConversation_uuid());
                }
                if (!x44.r(value.getServer_uuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getServer_uuid());
                }
                if (!x44.r(value.getSandbox_url_query(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, value.getSandbox_url_query());
                }
                if (!x44.r(value.getServer_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, value.getServer_name());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 5, value.getUi_domain());
                protoAdapter.encodeWithTag(writer, 6, value.getConnector_url());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RenderMcpAppRequest value) {
                value.getClass();
                int iE = value.unknownFields().e();
                if (!x44.r(value.getConversation_uuid(), "")) {
                    iE += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getConversation_uuid());
                }
                if (!x44.r(value.getServer_uuid(), "")) {
                    iE += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getServer_uuid());
                }
                if (!x44.r(value.getSandbox_url_query(), "")) {
                    iE += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSandbox_url_query());
                }
                if (!x44.r(value.getServer_name(), "")) {
                    iE += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getServer_name());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return protoAdapter.encodedSizeWithTag(6, value.getConnector_url()) + protoAdapter.encodedSizeWithTag(5, value.getUi_domain()) + iE;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RenderMcpAppRequest redact(RenderMcpAppRequest value) {
                value.getClass();
                return RenderMcpAppRequest.copy$default(value, null, null, null, null, null, null, ByteString.H, 63, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RenderMcpAppRequest value) throws EOFException {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 6, value.getConnector_url());
                protoAdapter.encodeWithTag(writer, 5, value.getUi_domain());
                if (!x44.r(value.getServer_name(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, value.getServer_name());
                }
                if (!x44.r(value.getSandbox_url_query(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, value.getSandbox_url_query());
                }
                if (!x44.r(value.getServer_uuid(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, value.getServer_uuid());
                }
                if (x44.r(value.getConversation_uuid(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, value.getConversation_uuid());
            }
        };
    }

    public /* synthetic */ RenderMcpAppRequest(String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? ByteString.H : byteString);
    }

    public static /* synthetic */ RenderMcpAppRequest copy$default(RenderMcpAppRequest renderMcpAppRequest, String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = renderMcpAppRequest.conversation_uuid;
        }
        if ((i & 2) != 0) {
            str2 = renderMcpAppRequest.server_uuid;
        }
        if ((i & 4) != 0) {
            str3 = renderMcpAppRequest.sandbox_url_query;
        }
        if ((i & 8) != 0) {
            str4 = renderMcpAppRequest.server_name;
        }
        if ((i & 16) != 0) {
            str5 = renderMcpAppRequest.ui_domain;
        }
        if ((i & 32) != 0) {
            str6 = renderMcpAppRequest.connector_url;
        }
        if ((i & 64) != 0) {
            byteString = renderMcpAppRequest.unknownFields();
        }
        String str7 = str6;
        ByteString byteString2 = byteString;
        String str8 = str5;
        String str9 = str3;
        return renderMcpAppRequest.copy(str, str2, str9, str4, str8, str7, byteString2);
    }

    public final RenderMcpAppRequest copy(String conversation_uuid, String server_uuid, String sandbox_url_query, String server_name, String ui_domain, String connector_url, ByteString unknownFields) {
        conversation_uuid.getClass();
        server_uuid.getClass();
        sandbox_url_query.getClass();
        server_name.getClass();
        unknownFields.getClass();
        return new RenderMcpAppRequest(conversation_uuid, server_uuid, sandbox_url_query, server_name, ui_domain, connector_url, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RenderMcpAppRequest)) {
            return false;
        }
        RenderMcpAppRequest renderMcpAppRequest = (RenderMcpAppRequest) other;
        return x44.r(unknownFields(), renderMcpAppRequest.unknownFields()) && x44.r(this.conversation_uuid, renderMcpAppRequest.conversation_uuid) && x44.r(this.server_uuid, renderMcpAppRequest.server_uuid) && x44.r(this.sandbox_url_query, renderMcpAppRequest.sandbox_url_query) && x44.r(this.server_name, renderMcpAppRequest.server_name) && x44.r(this.ui_domain, renderMcpAppRequest.ui_domain) && x44.r(this.connector_url, renderMcpAppRequest.connector_url);
    }

    public final String getConnector_url() {
        return this.connector_url;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    public final String getSandbox_url_query() {
        return this.sandbox_url_query;
    }

    public final String getServer_name() {
        return this.server_name;
    }

    public final String getServer_uuid() {
        return this.server_uuid;
    }

    public final String getUi_domain() {
        return this.ui_domain;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iL = kgh.l(kgh.l(kgh.l(kgh.l(unknownFields().hashCode() * 37, 37, this.conversation_uuid), 37, this.server_uuid), 37, this.sandbox_url_query), 37, this.server_name);
        String str = this.ui_domain;
        int iHashCode = (iL + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.connector_url;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @lz5
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m68newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ms6.y("conversation_uuid=", Internal.sanitize(this.conversation_uuid), arrayList);
        ms6.y("server_uuid=", Internal.sanitize(this.server_uuid), arrayList);
        ms6.y("sandbox_url_query=", Internal.sanitize(this.sandbox_url_query), arrayList);
        ms6.y("server_name=", Internal.sanitize(this.server_name), arrayList);
        String str = this.ui_domain;
        if (str != null) {
            ms6.y("ui_domain=", Internal.sanitize(str), arrayList);
        }
        String str2 = this.connector_url;
        if (str2 != null) {
            ms6.y("connector_url=", Internal.sanitize(str2), arrayList);
        }
        return w44.S0(arrayList, ", ", "RenderMcpAppRequest{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    @lz5
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m68newBuilder();
    }

    public RenderMcpAppRequest() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RenderMcpAppRequest(String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        byteString.getClass();
        this.conversation_uuid = str;
        this.server_uuid = str2;
        this.sandbox_url_query = str3;
        this.server_name = str4;
        this.ui_domain = str5;
        this.connector_url = str6;
    }
}
