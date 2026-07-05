package anthropic.claude.usercontent.sandbox;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import defpackage.jce;
import defpackage.lz5;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.pl9;
import defpackage.w44;
import defpackage.x44;
import java.io.EOFException;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\u0014\u001a\u00020\u0002H\u0017b\u0018\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\n\b\u0018\u0012\u0006\b\n0\u00198\u001aJ\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0082\u0004J\n\u0010\u001f\u001a\u00020 H\u0096\u0080\u0004J\b\u0010!\u001a\u00020\"H\u0016J\u001a\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004RO\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u0092\u00026\b\n\u0012\b\b\u000b\u0012\u0004\b\u0003\u0010\u0002\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\n\b\u000e\u0012\u0006\b\n0\u000f8\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\b\b\u0013\u0012\u0004\b\u0003\u0010\u0000¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006%"}, d2 = {"Lanthropic/claude/usercontent/sandbox/GetFileResponse;", "Lcom/squareup/wire/Message;", "", "value_", "Lokio/ByteString;", "unknownFields", "<init>", "(Lokio/ByteString;Lokio/ByteString;)V", "getValue_", "()Lokio/ByteString;", "Lcom/squareup/wire/WireField;", "tag", "adapter", "com.squareup.wire.ProtoAdapter#BYTES", "label", "Lcom/squareup/wire/WireField$Label;", "OMIT_IDENTITY", "declaredName", ExperienceToggle.DEFAULT_PARAM_KEY, "schemaIndex", "newBuilder", "Lkotlin/Deprecated;", "message", "Shouldn't be used in Kotlin", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Claude:protos"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class GetFileResponse extends Message {
    public static final ProtoAdapter<GetFileResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", declaredName = ExperienceToggle.DEFAULT_PARAM_KEY, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ByteString value_;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final pl9 pl9VarB = jce.a.b(GetFileResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetFileResponse>(fieldEncoding, pl9VarB, syntax) { // from class: anthropic.claude.usercontent.sandbox.GetFileResponse$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetFileResponse decode(ProtoReader reader) {
                reader.getClass();
                ByteString byteStringDecode = ByteString.H;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetFileResponse(byteStringDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        byteStringDecode = ProtoAdapter.BYTES.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetFileResponse value) {
                writer.getClass();
                value.getClass();
                if (!x44.r(value.getValue_(), ByteString.H)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.getValue_());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetFileResponse value) {
                value.getClass();
                int iE = value.unknownFields().e();
                return !x44.r(value.getValue_(), ByteString.H) ? ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getValue_()) + iE : iE;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetFileResponse redact(GetFileResponse value) {
                value.getClass();
                return GetFileResponse.copy$default(value, null, ByteString.H, 1, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetFileResponse value) throws EOFException {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                if (x44.r(value.getValue_(), ByteString.H)) {
                    return;
                }
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.getValue_());
            }
        };
    }

    public /* synthetic */ GetFileResponse(ByteString byteString, ByteString byteString2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? ByteString.H : byteString, (i & 2) != 0 ? ByteString.H : byteString2);
    }

    public static /* synthetic */ GetFileResponse copy$default(GetFileResponse getFileResponse, ByteString byteString, ByteString byteString2, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = getFileResponse.value_;
        }
        if ((i & 2) != 0) {
            byteString2 = getFileResponse.unknownFields();
        }
        return getFileResponse.copy(byteString, byteString2);
    }

    public final GetFileResponse copy(ByteString value_, ByteString unknownFields) {
        value_.getClass();
        unknownFields.getClass();
        return new GetFileResponse(value_, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetFileResponse)) {
            return false;
        }
        GetFileResponse getFileResponse = (GetFileResponse) other;
        return x44.r(unknownFields(), getFileResponse.unknownFields()) && x44.r(this.value_, getFileResponse.value_);
    }

    public final ByteString getValue_() {
        return this.value_;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.value_.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @lz5
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m77newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("value_=" + this.value_);
        return w44.S0(arrayList, ", ", "GetFileResponse{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    @lz5
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m77newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetFileResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFileResponse(ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString.getClass();
        byteString2.getClass();
        this.value_ = byteString;
    }
}
