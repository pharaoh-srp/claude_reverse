package com.anthropic.claude.artifact.model;

import com.anthropic.claude.R;
import com.anthropic.claude.artifact.model.ArtifactType;
import com.anthropic.claude.types.strings.ArtifactId;
import com.anthropic.claude.types.strings.ArtifactIdentifier;
import defpackage.b5;
import defpackage.ide;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lqa;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.ox3;
import defpackage.qr0;
import defpackage.qx3;
import defpackage.sq6;
import defpackage.ud0;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wg6;
import defpackage.x44;
import defpackage.yb5;
import java.util.Locale;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FGBS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B_\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0012\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b!\u0010\"J\\\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b&\u0010\u0019J\u0010\u0010'\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b9\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b<\u0010\u0019R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b=\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b\u000e\u0010\"R\u0011\u0010@\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b?\u0010(R\u0011\u0010B\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\bA\u0010(R\u0013\u0010D\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bC\u0010\u0019¨\u0006H"}, d2 = {"Lcom/anthropic/claude/artifact/model/ArtifactMetadata;", "", "Lcom/anthropic/claude/artifact/model/ArtifactUuid;", "uuid", "Lcom/anthropic/claude/types/strings/ArtifactId;", "versionUuid", "Lcom/anthropic/claude/types/strings/ArtifactIdentifier;", ArtifactMetadata.ATTR_IDENTIFIER, "Lcom/anthropic/claude/artifact/model/ArtifactType;", "type", "", ArtifactMetadata.ATTR_TITLE, ArtifactMetadata.ATTR_LANGUAGE, "", "isComplete", "<init>", "(Lcom/anthropic/claude/artifact/model/ArtifactUuid;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/artifact/model/ArtifactType;Ljava/lang/String;Ljava/lang/String;ZLmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/artifact/model/ArtifactUuid;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/artifact/model/ArtifactType;Ljava/lang/String;Ljava/lang/String;ZLvnf;Lmq5;)V", "component1", "()Lcom/anthropic/claude/artifact/model/ArtifactUuid;", "component2-QssJVS4", "()Ljava/lang/String;", "component2", "component3-eX_QYXY", "component3", "component4", "()Lcom/anthropic/claude/artifact/model/ArtifactType;", "component5", "component6", "component7", "()Z", "copy-cMrKGk4", "(Lcom/anthropic/claude/artifact/model/ArtifactUuid;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/artifact/model/ArtifactType;Ljava/lang/String;Ljava/lang/String;Z)Lcom/anthropic/claude/artifact/model/ArtifactMetadata;", "copy", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$artifact", "(Lcom/anthropic/claude/artifact/model/ArtifactMetadata;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/anthropic/claude/artifact/model/ArtifactUuid;", "getUuid", "Ljava/lang/String;", "getVersionUuid-QssJVS4", "getIdentifier-eX_QYXY", "Lcom/anthropic/claude/artifact/model/ArtifactType;", "getType", "getTitle", "getLanguage", "Z", "getIcon", "icon", "getIconLabel", "iconLabel", "getFileExtension", "fileExtension", "Companion", "qr0", "pr0", "artifact"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ArtifactMetadata {
    public static final int $stable = 0;
    private static final String ATTR_IDENTIFIER = "identifier";
    private static final String ATTR_LANGUAGE = "language";
    private static final String ATTR_TITLE = "title";
    private static final String ATTR_TYPE = "type";
    private static final String ATTR_VERSION_UUID = "version_uuid";
    private static final int DefaultIcon;
    private static final int DefaultIconLabel;
    private static final int DefaultTitle;
    private static final ide attrRegex;
    private final String identifier;
    private final boolean isComplete;
    private final String language;
    private final String title;
    private final ArtifactType type;
    private final ArtifactUuid uuid;
    private final String versionUuid;
    public static final qr0 Companion = new qr0();
    private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new b5(27)), null, null, null};

    static {
        ud0 ud0Var = ud0.d;
        ud0 ud0Var2 = ud0.d;
        DefaultIcon = R.drawable.anthropicon_code;
        DefaultIconLabel = R.string.artifact_type_code;
        DefaultTitle = R.string.artifact_default_title;
        attrRegex = new ide("([a-zA-Z0-9_]+)=\"([^\"]+)\"");
    }

    private ArtifactMetadata(int i, ArtifactUuid artifactUuid, String str, String str2, ArtifactType artifactType, String str3, String str4, boolean z, vnf vnfVar) {
        if ((i & 1) == 0) {
            ArtifactUuid.Companion.getClass();
            artifactUuid = ArtifactUuid.EMPTY;
        }
        this.uuid = artifactUuid;
        if ((i & 2) == 0) {
            ArtifactId.Companion.getClass();
            this.versionUuid = ArtifactId.EMPTY;
        } else {
            this.versionUuid = str;
        }
        if ((i & 4) == 0) {
            this.identifier = ArtifactIdentifier.m965constructorimpl(this.uuid.getValue());
        } else {
            this.identifier = str2;
        }
        if ((i & 8) == 0) {
            this.type = null;
        } else {
            this.type = artifactType;
        }
        if ((i & 16) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
        if ((i & 32) == 0) {
            this.language = null;
        } else {
            this.language = str4;
        }
        if ((i & 64) == 0) {
            this.isComplete = false;
        } else {
            this.isComplete = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ArtifactType.Companion.serializer();
    }

    /* JADX INFO: renamed from: copy-cMrKGk4$default, reason: not valid java name */
    public static /* synthetic */ ArtifactMetadata m533copycMrKGk4$default(ArtifactMetadata artifactMetadata, ArtifactUuid artifactUuid, String str, String str2, ArtifactType artifactType, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            artifactUuid = artifactMetadata.uuid;
        }
        if ((i & 2) != 0) {
            str = artifactMetadata.versionUuid;
        }
        if ((i & 4) != 0) {
            str2 = artifactMetadata.identifier;
        }
        if ((i & 8) != 0) {
            artifactType = artifactMetadata.type;
        }
        if ((i & 16) != 0) {
            str3 = artifactMetadata.title;
        }
        if ((i & 32) != 0) {
            str4 = artifactMetadata.language;
        }
        if ((i & 64) != 0) {
            z = artifactMetadata.isComplete;
        }
        String str5 = str4;
        boolean z2 = z;
        String str6 = str3;
        String str7 = str2;
        return artifactMetadata.m536copycMrKGk4(artifactUuid, str, str7, artifactType, str6, str5, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void write$Self$artifact(com.anthropic.claude.artifact.model.ArtifactMetadata r4, defpackage.vd4 r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
        /*
            kw9[] r0 = com.anthropic.claude.artifact.model.ArtifactMetadata.$childSerializers
            boolean r1 = r5.E(r6)
            if (r1 == 0) goto L9
            goto L1a
        L9:
            com.anthropic.claude.artifact.model.ArtifactUuid r1 = r4.uuid
            tt0 r2 = com.anthropic.claude.artifact.model.ArtifactUuid.Companion
            r2.getClass()
            com.anthropic.claude.artifact.model.ArtifactUuid r2 = com.anthropic.claude.artifact.model.ArtifactUuid.access$getEMPTY$cp()
            boolean r1 = defpackage.x44.r(r1, r2)
            if (r1 != 0) goto L22
        L1a:
            st0 r1 = defpackage.st0.a
            com.anthropic.claude.artifact.model.ArtifactUuid r2 = r4.uuid
            r3 = 0
            r5.r(r6, r3, r1, r2)
        L22:
            boolean r1 = r5.E(r6)
            if (r1 == 0) goto L29
            goto L3a
        L29:
            java.lang.String r1 = r4.versionUuid
            jr0 r2 = com.anthropic.claude.types.strings.ArtifactId.Companion
            r2.getClass()
            java.lang.String r2 = com.anthropic.claude.types.strings.ArtifactId.access$getEMPTY$cp()
            boolean r1 = com.anthropic.claude.types.strings.ArtifactId.m960equalsimpl0(r1, r2)
            if (r1 != 0) goto L46
        L3a:
            ir0 r1 = defpackage.ir0.a
            java.lang.String r2 = r4.versionUuid
            com.anthropic.claude.types.strings.ArtifactId r2 = com.anthropic.claude.types.strings.ArtifactId.m957boximpl(r2)
            r3 = 1
            r5.r(r6, r3, r1, r2)
        L46:
            boolean r1 = r5.E(r6)
            if (r1 == 0) goto L4d
            goto L5f
        L4d:
            java.lang.String r1 = r4.identifier
            com.anthropic.claude.artifact.model.ArtifactUuid r2 = r4.uuid
            java.lang.String r2 = r2.getValue()
            java.lang.String r2 = com.anthropic.claude.types.strings.ArtifactIdentifier.m965constructorimpl(r2)
            boolean r1 = com.anthropic.claude.types.strings.ArtifactIdentifier.m967equalsimpl0(r1, r2)
            if (r1 != 0) goto L6b
        L5f:
            kr0 r1 = defpackage.kr0.a
            java.lang.String r2 = r4.identifier
            com.anthropic.claude.types.strings.ArtifactIdentifier r2 = com.anthropic.claude.types.strings.ArtifactIdentifier.m964boximpl(r2)
            r3 = 2
            r5.r(r6, r3, r1, r2)
        L6b:
            boolean r1 = r5.E(r6)
            if (r1 == 0) goto L72
            goto L76
        L72:
            com.anthropic.claude.artifact.model.ArtifactType r1 = r4.type
            if (r1 == 0) goto L84
        L76:
            r1 = 3
            r0 = r0[r1]
            java.lang.Object r0 = r0.getValue()
            znf r0 = (defpackage.znf) r0
            com.anthropic.claude.artifact.model.ArtifactType r2 = r4.type
            r5.B(r6, r1, r0, r2)
        L84:
            boolean r0 = r5.E(r6)
            if (r0 == 0) goto L8b
            goto L8f
        L8b:
            java.lang.String r0 = r4.title
            if (r0 == 0) goto L97
        L8f:
            srg r0 = defpackage.srg.a
            java.lang.String r1 = r4.title
            r2 = 4
            r5.B(r6, r2, r0, r1)
        L97:
            boolean r0 = r5.E(r6)
            if (r0 == 0) goto L9e
            goto La2
        L9e:
            java.lang.String r0 = r4.language
            if (r0 == 0) goto Laa
        La2:
            srg r0 = defpackage.srg.a
            java.lang.String r1 = r4.language
            r2 = 5
            r5.B(r6, r2, r0, r1)
        Laa:
            boolean r0 = r5.E(r6)
            if (r0 == 0) goto Lb1
            goto Lb5
        Lb1:
            boolean r0 = r4.isComplete
            if (r0 == 0) goto Lbb
        Lb5:
            boolean r4 = r4.isComplete
            r0 = 6
            r5.p(r6, r0, r4)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.artifact.model.ArtifactMetadata.write$Self$artifact(com.anthropic.claude.artifact.model.ArtifactMetadata, vd4, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ArtifactUuid getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component2-QssJVS4, reason: not valid java name and from getter */
    public final String getVersionUuid() {
        return this.versionUuid;
    }

    /* JADX INFO: renamed from: component3-eX_QYXY, reason: not valid java name and from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ArtifactType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsComplete() {
        return this.isComplete;
    }

    /* JADX INFO: renamed from: copy-cMrKGk4, reason: not valid java name */
    public final ArtifactMetadata m536copycMrKGk4(ArtifactUuid uuid, String versionUuid, String identifier, ArtifactType type, String title, String language, boolean isComplete) {
        uuid.getClass();
        versionUuid.getClass();
        identifier.getClass();
        return new ArtifactMetadata(uuid, versionUuid, identifier, type, title, language, isComplete, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArtifactMetadata)) {
            return false;
        }
        ArtifactMetadata artifactMetadata = (ArtifactMetadata) other;
        return x44.r(this.uuid, artifactMetadata.uuid) && ArtifactId.m960equalsimpl0(this.versionUuid, artifactMetadata.versionUuid) && ArtifactIdentifier.m967equalsimpl0(this.identifier, artifactMetadata.identifier) && x44.r(this.type, artifactMetadata.type) && x44.r(this.title, artifactMetadata.title) && x44.r(this.language, artifactMetadata.language) && this.isComplete == artifactMetadata.isComplete;
    }

    public final String getFileExtension() {
        ArtifactType artifactType = this.type;
        if (x44.r(artifactType, ArtifactType.Text.INSTANCE)) {
            return "txt";
        }
        if (x44.r(artifactType, ArtifactType.Markdown.INSTANCE)) {
            return "md";
        }
        if (x44.r(artifactType, ArtifactType.Html.INSTANCE)) {
            return "html";
        }
        if (x44.r(artifactType, ArtifactType.Svg.INSTANCE)) {
            return "svg";
        }
        if (x44.r(artifactType, ArtifactType.Mermaid.INSTANCE)) {
            return "mmd";
        }
        if (x44.r(artifactType, ArtifactType.React.INSTANCE)) {
            return "tsx";
        }
        if (!x44.r(artifactType, ArtifactType.Code.INSTANCE) && !x44.r(artifactType, ArtifactType.Repl.INSTANCE)) {
            if (!(artifactType instanceof ArtifactType.BinaryDocument) && artifactType != null) {
                wg6.i();
            }
            return null;
        }
        String str = this.language;
        if (str == null) {
            return "txt";
        }
        lqa lqaVar = qx3.d;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        ox3 ox3Var = (ox3) lqaVar.get(lowerCase);
        String str2 = ox3Var != null ? ox3Var.b : null;
        return str2 == null ? "txt" : str2;
    }

    public final int getIcon() {
        ArtifactType artifactType = this.type;
        if (x44.r(artifactType, ArtifactType.Text.INSTANCE) || x44.r(artifactType, ArtifactType.Markdown.INSTANCE)) {
            ud0 ud0Var = ud0.d;
            ud0 ud0Var2 = ud0.d;
            return R.drawable.anthropicon_scroll;
        }
        if (x44.r(artifactType, ArtifactType.Svg.INSTANCE)) {
            ud0 ud0Var3 = ud0.d;
            ud0 ud0Var4 = ud0.d;
            return R.drawable.anthropicon_shapes;
        }
        if (x44.r(artifactType, ArtifactType.Html.INSTANCE)) {
            ud0 ud0Var5 = ud0.d;
            ud0 ud0Var6 = ud0.d;
            return R.drawable.anthropicon_globe;
        }
        if (x44.r(artifactType, ArtifactType.Code.INSTANCE) || x44.r(artifactType, ArtifactType.Mermaid.INSTANCE) || x44.r(artifactType, ArtifactType.React.INSTANCE) || x44.r(artifactType, ArtifactType.Repl.INSTANCE)) {
            ud0 ud0Var7 = ud0.d;
            ud0 ud0Var8 = ud0.d;
            return R.drawable.anthropicon_code;
        }
        if (!(artifactType instanceof ArtifactType.BinaryDocument)) {
            return DefaultIcon;
        }
        ud0 ud0Var9 = ud0.d;
        ud0 ud0Var10 = ud0.d;
        return R.drawable.anthropicon_file;
    }

    public final int getIconLabel() {
        ArtifactType artifactType = this.type;
        return (x44.r(artifactType, ArtifactType.Text.INSTANCE) || x44.r(artifactType, ArtifactType.Markdown.INSTANCE)) ? R.string.artifact_type_document : x44.r(artifactType, ArtifactType.Svg.INSTANCE) ? R.string.artifact_type_image : x44.r(artifactType, ArtifactType.Html.INSTANCE) ? R.string.artifact_type_interactive : (x44.r(artifactType, ArtifactType.Code.INSTANCE) || x44.r(artifactType, ArtifactType.Mermaid.INSTANCE) || x44.r(artifactType, ArtifactType.React.INSTANCE)) ? R.string.artifact_type_code : artifactType instanceof ArtifactType.BinaryDocument ? R.string.artifact_type_document : DefaultIconLabel;
    }

    /* JADX INFO: renamed from: getIdentifier-eX_QYXY, reason: not valid java name */
    public final String m537getIdentifiereX_QYXY() {
        return this.identifier;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ArtifactType getType() {
        return this.type;
    }

    public final ArtifactUuid getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: getVersionUuid-QssJVS4, reason: not valid java name */
    public final String m538getVersionUuidQssJVS4() {
        return this.versionUuid;
    }

    public int hashCode() {
        int iM968hashCodeimpl = (ArtifactIdentifier.m968hashCodeimpl(this.identifier) + ((ArtifactId.m961hashCodeimpl(this.versionUuid) + (this.uuid.hashCode() * 31)) * 31)) * 31;
        ArtifactType artifactType = this.type;
        int iHashCode = (iM968hashCodeimpl + (artifactType == null ? 0 : artifactType.hashCode())) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.language;
        return Boolean.hashCode(this.isComplete) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final boolean isComplete() {
        return this.isComplete;
    }

    public String toString() {
        ArtifactUuid artifactUuid = this.uuid;
        String strM962toStringimpl = ArtifactId.m962toStringimpl(this.versionUuid);
        String strM969toStringimpl = ArtifactIdentifier.m969toStringimpl(this.identifier);
        ArtifactType artifactType = this.type;
        String str = this.title;
        String str2 = this.language;
        boolean z = this.isComplete;
        StringBuilder sb = new StringBuilder("ArtifactMetadata(uuid=");
        sb.append(artifactUuid);
        sb.append(", versionUuid=");
        sb.append(strM962toStringimpl);
        sb.append(", identifier=");
        sb.append(strM969toStringimpl);
        sb.append(", type=");
        sb.append(artifactType);
        sb.append(", title=");
        kgh.u(sb, str, ", language=", str2, ", isComplete=");
        return sq6.v(")", sb, z);
    }

    public /* synthetic */ ArtifactMetadata(ArtifactUuid artifactUuid, String str, String str2, ArtifactType artifactType, String str3, String str4, boolean z, mq5 mq5Var) {
        this(artifactUuid, str, str2, artifactType, str3, str4, z);
    }

    public /* synthetic */ ArtifactMetadata(int i, ArtifactUuid artifactUuid, String str, String str2, ArtifactType artifactType, String str3, String str4, boolean z, vnf vnfVar, mq5 mq5Var) {
        this(i, artifactUuid, str, str2, artifactType, str3, str4, z, vnfVar);
    }

    private ArtifactMetadata(ArtifactUuid artifactUuid, String str, String str2, ArtifactType artifactType, String str3, String str4, boolean z) {
        artifactUuid.getClass();
        str.getClass();
        str2.getClass();
        this.uuid = artifactUuid;
        this.versionUuid = str;
        this.identifier = str2;
        this.type = artifactType;
        this.title = str3;
        this.language = str4;
        this.isComplete = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ArtifactMetadata(ArtifactUuid artifactUuid, String str, String str2, ArtifactType artifactType, String str3, String str4, boolean z, int i, mq5 mq5Var) {
        ArtifactUuid artifactUuid2;
        String str5;
        if ((i & 1) != 0) {
            ArtifactUuid.Companion.getClass();
            artifactUuid2 = ArtifactUuid.EMPTY;
        } else {
            artifactUuid2 = artifactUuid;
        }
        if ((i & 2) != 0) {
            ArtifactId.Companion.getClass();
            str5 = ArtifactId.EMPTY;
        } else {
            str5 = str;
        }
        this(artifactUuid2, str5, (i & 4) != 0 ? ArtifactIdentifier.m965constructorimpl(artifactUuid2.getValue()) : str2, (i & 8) != 0 ? null : artifactType, (i & 16) != 0 ? null : str3, (i & 32) == 0 ? str4 : null, (i & 64) != 0 ? false : z, null);
    }
}
