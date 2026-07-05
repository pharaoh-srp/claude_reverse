package com.anthropic.claude.configs.flags;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.wj7;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0016J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0016¨\u0006*"}, d2 = {"Lcom/anthropic/claude/configs/flags/FileUploadConfig;", "", "", "max_in_context_file_bytes", "max_inline_paste_bytes", "max_per_message_upload_count", "<init>", "(III)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IIIILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$configs", "(Lcom/anthropic/claude/configs/flags/FileUploadConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "copy", "(III)Lcom/anthropic/claude/configs/flags/FileUploadConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMax_in_context_file_bytes", "getMax_inline_paste_bytes", "getMax_per_message_upload_count", "Companion", "wj7", "vj7", "configs"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class FileUploadConfig {
    public static final int $stable = 0;
    public static final wj7 Companion = new wj7();
    public static final String FEATURE_KEY = "cai_file_upload_config";
    private final int max_in_context_file_bytes;
    private final int max_inline_paste_bytes;
    private final int max_per_message_upload_count;

    public /* synthetic */ FileUploadConfig(int i, int i2, int i3, int i4, vnf vnfVar) {
        this.max_in_context_file_bytes = (i & 1) == 0 ? 15360 : i2;
        if ((i & 2) == 0) {
            this.max_inline_paste_bytes = FreeTypeConstants.FT_LOAD_MONOCHROME;
        } else {
            this.max_inline_paste_bytes = i3;
        }
        if ((i & 4) == 0) {
            this.max_per_message_upload_count = 20;
        } else {
            this.max_per_message_upload_count = i4;
        }
    }

    public static /* synthetic */ FileUploadConfig copy$default(FileUploadConfig fileUploadConfig, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = fileUploadConfig.max_in_context_file_bytes;
        }
        if ((i4 & 2) != 0) {
            i2 = fileUploadConfig.max_inline_paste_bytes;
        }
        if ((i4 & 4) != 0) {
            i3 = fileUploadConfig.max_per_message_upload_count;
        }
        return fileUploadConfig.copy(i, i2, i3);
    }

    public static final /* synthetic */ void write$Self$configs(FileUploadConfig self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.max_in_context_file_bytes != 15360) {
            output.l(0, self.max_in_context_file_bytes, serialDesc);
        }
        if (output.E(serialDesc) || self.max_inline_paste_bytes != 4096) {
            output.l(1, self.max_inline_paste_bytes, serialDesc);
        }
        if (!output.E(serialDesc) && self.max_per_message_upload_count == 20) {
            return;
        }
        output.l(2, self.max_per_message_upload_count, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMax_in_context_file_bytes() {
        return this.max_in_context_file_bytes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMax_inline_paste_bytes() {
        return this.max_inline_paste_bytes;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMax_per_message_upload_count() {
        return this.max_per_message_upload_count;
    }

    public final FileUploadConfig copy(int max_in_context_file_bytes, int max_inline_paste_bytes, int max_per_message_upload_count) {
        return new FileUploadConfig(max_in_context_file_bytes, max_inline_paste_bytes, max_per_message_upload_count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileUploadConfig)) {
            return false;
        }
        FileUploadConfig fileUploadConfig = (FileUploadConfig) other;
        return this.max_in_context_file_bytes == fileUploadConfig.max_in_context_file_bytes && this.max_inline_paste_bytes == fileUploadConfig.max_inline_paste_bytes && this.max_per_message_upload_count == fileUploadConfig.max_per_message_upload_count;
    }

    public final int getMax_in_context_file_bytes() {
        return this.max_in_context_file_bytes;
    }

    public final int getMax_inline_paste_bytes() {
        return this.max_inline_paste_bytes;
    }

    public final int getMax_per_message_upload_count() {
        return this.max_per_message_upload_count;
    }

    public int hashCode() {
        return Integer.hashCode(this.max_per_message_upload_count) + vb7.c(this.max_inline_paste_bytes, Integer.hashCode(this.max_in_context_file_bytes) * 31, 31);
    }

    public String toString() {
        return vb7.l(this.max_per_message_upload_count, ")", vb7.v("FileUploadConfig(max_in_context_file_bytes=", ", max_inline_paste_bytes=", this.max_in_context_file_bytes, this.max_inline_paste_bytes, ", max_per_message_upload_count="));
    }

    public FileUploadConfig(int i, int i2, int i3) {
        this.max_in_context_file_bytes = i;
        this.max_inline_paste_bytes = i2;
        this.max_per_message_upload_count = i3;
    }

    public FileUploadConfig() {
        this(0, 0, 0, 7, (mq5) null);
    }

    public /* synthetic */ FileUploadConfig(int i, int i2, int i3, int i4, mq5 mq5Var) {
        this((i4 & 1) != 0 ? 15360 : i, (i4 & 2) != 0 ? FreeTypeConstants.FT_LOAD_MONOCHROME : i2, (i4 & 4) != 0 ? 20 : i3);
    }
}
