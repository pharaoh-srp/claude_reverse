package com.anthropic.claude.api.chat.tool;

import com.anthropic.claude.api.common.PixelSize;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.a3d;
import defpackage.e79;
import defpackage.gvj;
import defpackage.hw8;
import defpackage.ij0;
import defpackage.iw8;
import defpackage.jw8;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002KLB{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u008c\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u0017J\u0010\u0010#\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\tHÂ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\tHÂ\u0003¢\u0006\u0004\b+\u0010*J\u0012\u0010,\u001a\u0004\u0018\u00010\tHÂ\u0003¢\u0006\u0004\b,\u0010*J\u0012\u0010-\u001a\u0004\u0018\u00010\tHÂ\u0003¢\u0006\u0004\b-\u0010*J'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b9\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b:\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b;\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b<\u0010\u0017R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010=R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010=R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b>\u0010\u0017R\u0016\u0010\r\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010=R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010=R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\b?\u0010\u0017R\"\u0010A\u001a\u0004\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010B\u0012\u0004\bE\u0010F\u001a\u0004\bC\u0010DR\"\u0010G\u001a\u0004\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bG\u0010B\u0012\u0004\bI\u0010F\u001a\u0004\bH\u0010D¨\u0006M"}, d2 = {"Lcom/anthropic/claude/api/chat/tool/ImageGalleryItem;", "", "Lcom/anthropic/claude/api/chat/tool/ImageGalleryItemId;", "id", "", "url", "title", "source", "page_url", "", "width", "height", "thumbnail_url", "thumbnail_width", "thumbnail_height", "telemetry", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lmq5;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lvnf;Lmq5;)V", "component1-ivCCbqw", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component8", "component11", "copy-bj3SeWM", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/anthropic/claude/api/chat/tool/ImageGalleryItem;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "component6", "()Ljava/lang/Integer;", "component7", "component9", "component10", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/tool/ImageGalleryItem;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId-ivCCbqw", "getUrl", "getTitle", "getSource", "getPage_url", "Ljava/lang/Integer;", "getThumbnail_url", "getTelemetry", "Lcom/anthropic/claude/api/common/PixelSize;", "imageSize", "Lcom/anthropic/claude/api/common/PixelSize;", "getImageSize", "()Lcom/anthropic/claude/api/common/PixelSize;", "getImageSize$annotations", "()V", "thumbnailSize", "getThumbnailSize", "getThumbnailSize$annotations", "Companion", "hw8", "iw8", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ImageGalleryItem {
    public static final int $stable = 0;
    public static final iw8 Companion = new iw8();
    private final Integer height;
    private final String id;
    private final PixelSize imageSize;
    private final String page_url;
    private final String source;
    private final String telemetry;
    private final PixelSize thumbnailSize;
    private final Integer thumbnail_height;
    private final String thumbnail_url;
    private final Integer thumbnail_width;
    private final String title;
    private final String url;
    private final Integer width;

    private /* synthetic */ ImageGalleryItem(int i, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, String str6, Integer num3, Integer num4, String str7, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, hw8.a.getDescriptor());
            throw null;
        }
        this.id = str;
        this.url = str2;
        this.title = str3;
        this.source = str4;
        if ((i & 16) == 0) {
            this.page_url = null;
        } else {
            this.page_url = str5;
        }
        if ((i & 32) == 0) {
            this.width = null;
        } else {
            this.width = num;
        }
        if ((i & 64) == 0) {
            this.height = null;
        } else {
            this.height = num2;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.thumbnail_url = null;
        } else {
            this.thumbnail_url = str6;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.thumbnail_width = null;
        } else {
            this.thumbnail_width = num3;
        }
        if ((i & 512) == 0) {
            this.thumbnail_height = null;
        } else {
            this.thumbnail_height = num4;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.telemetry = null;
        } else {
            this.telemetry = str7;
        }
        a3d a3dVar = PixelSize.Companion;
        Integer num5 = this.width;
        Integer num6 = this.height;
        a3dVar.getClass();
        this.imageSize = a3d.a(num5, num6);
        this.thumbnailSize = a3d.a(this.thumbnail_width, this.thumbnail_height);
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    private final Integer getThumbnail_height() {
        return this.thumbnail_height;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    private final Integer getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    private final Integer getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    private final Integer getThumbnail_width() {
        return this.thumbnail_width;
    }

    /* JADX INFO: renamed from: copy-bj3SeWM$default, reason: not valid java name */
    public static /* synthetic */ ImageGalleryItem m300copybj3SeWM$default(ImageGalleryItem imageGalleryItem, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, String str6, Integer num3, Integer num4, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageGalleryItem.id;
        }
        if ((i & 2) != 0) {
            str2 = imageGalleryItem.url;
        }
        if ((i & 4) != 0) {
            str3 = imageGalleryItem.title;
        }
        if ((i & 8) != 0) {
            str4 = imageGalleryItem.source;
        }
        if ((i & 16) != 0) {
            str5 = imageGalleryItem.page_url;
        }
        if ((i & 32) != 0) {
            num = imageGalleryItem.width;
        }
        if ((i & 64) != 0) {
            num2 = imageGalleryItem.height;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            str6 = imageGalleryItem.thumbnail_url;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            num3 = imageGalleryItem.thumbnail_width;
        }
        if ((i & 512) != 0) {
            num4 = imageGalleryItem.thumbnail_height;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
            str7 = imageGalleryItem.telemetry;
        }
        Integer num5 = num4;
        String str8 = str7;
        String str9 = str6;
        Integer num6 = num3;
        Integer num7 = num;
        Integer num8 = num2;
        String str10 = str5;
        String str11 = str3;
        return imageGalleryItem.m302copybj3SeWM(str, str2, str11, str4, str10, num7, num8, str9, num6, num5, str8);
    }

    public static /* synthetic */ void getImageSize$annotations() {
    }

    public static /* synthetic */ void getThumbnailSize$annotations() {
    }

    public static final /* synthetic */ void write$Self$api(ImageGalleryItem self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, jw8.a, ImageGalleryItemId.m304boximpl(self.id));
        output.q(serialDesc, 1, self.url);
        output.q(serialDesc, 2, self.title);
        output.q(serialDesc, 3, self.source);
        if (output.E(serialDesc) || self.page_url != null) {
            output.B(serialDesc, 4, srg.a, self.page_url);
        }
        if (output.E(serialDesc) || self.width != null) {
            output.B(serialDesc, 5, e79.a, self.width);
        }
        if (output.E(serialDesc) || self.height != null) {
            output.B(serialDesc, 6, e79.a, self.height);
        }
        if (output.E(serialDesc) || self.thumbnail_url != null) {
            output.B(serialDesc, 7, srg.a, self.thumbnail_url);
        }
        if (output.E(serialDesc) || self.thumbnail_width != null) {
            output.B(serialDesc, 8, e79.a, self.thumbnail_width);
        }
        if (output.E(serialDesc) || self.thumbnail_height != null) {
            output.B(serialDesc, 9, e79.a, self.thumbnail_height);
        }
        if (!output.E(serialDesc) && self.telemetry == null) {
            return;
        }
        output.B(serialDesc, 10, srg.a, self.telemetry);
    }

    /* JADX INFO: renamed from: component1-ivCCbqw, reason: not valid java name and from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTelemetry() {
        return this.telemetry;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPage_url() {
        return this.page_url;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getThumbnail_url() {
        return this.thumbnail_url;
    }

    /* JADX INFO: renamed from: copy-bj3SeWM, reason: not valid java name */
    public final ImageGalleryItem m302copybj3SeWM(String id, String url, String title, String source, String page_url, Integer width, Integer height, String thumbnail_url, Integer thumbnail_width, Integer thumbnail_height, String telemetry) {
        id.getClass();
        url.getClass();
        title.getClass();
        source.getClass();
        return new ImageGalleryItem(id, url, title, source, page_url, width, height, thumbnail_url, thumbnail_width, thumbnail_height, telemetry, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageGalleryItem)) {
            return false;
        }
        ImageGalleryItem imageGalleryItem = (ImageGalleryItem) other;
        return ImageGalleryItemId.m307equalsimpl0(this.id, imageGalleryItem.id) && x44.r(this.url, imageGalleryItem.url) && x44.r(this.title, imageGalleryItem.title) && x44.r(this.source, imageGalleryItem.source) && x44.r(this.page_url, imageGalleryItem.page_url) && x44.r(this.width, imageGalleryItem.width) && x44.r(this.height, imageGalleryItem.height) && x44.r(this.thumbnail_url, imageGalleryItem.thumbnail_url) && x44.r(this.thumbnail_width, imageGalleryItem.thumbnail_width) && x44.r(this.thumbnail_height, imageGalleryItem.thumbnail_height) && x44.r(this.telemetry, imageGalleryItem.telemetry);
    }

    /* JADX INFO: renamed from: getId-ivCCbqw, reason: not valid java name */
    public final String m303getIdivCCbqw() {
        return this.id;
    }

    public final PixelSize getImageSize() {
        return this.imageSize;
    }

    public final String getPage_url() {
        return this.page_url;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getTelemetry() {
        return this.telemetry;
    }

    public final PixelSize getThumbnailSize() {
        return this.thumbnailSize;
    }

    public final String getThumbnail_url() {
        return this.thumbnail_url;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iL = kgh.l(kgh.l(kgh.l(ImageGalleryItemId.m308hashCodeimpl(this.id) * 31, 31, this.url), 31, this.title), 31, this.source);
        String str = this.page_url;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.width;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.thumbnail_url;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.thumbnail_width;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.thumbnail_height;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.telemetry;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String strM309toStringimpl = ImageGalleryItemId.m309toStringimpl(this.id);
        String str = this.url;
        String str2 = this.title;
        String str3 = this.source;
        String str4 = this.page_url;
        Integer num = this.width;
        Integer num2 = this.height;
        String str5 = this.thumbnail_url;
        Integer num3 = this.thumbnail_width;
        Integer num4 = this.thumbnail_height;
        String str6 = this.telemetry;
        StringBuilder sbR = kgh.r("ImageGalleryItem(id=", strM309toStringimpl, ", url=", str, ", title=");
        kgh.u(sbR, str2, ", source=", str3, ", page_url=");
        sbR.append(str4);
        sbR.append(", width=");
        sbR.append(num);
        sbR.append(", height=");
        sbR.append(num2);
        sbR.append(", thumbnail_url=");
        sbR.append(str5);
        sbR.append(", thumbnail_width=");
        sbR.append(num3);
        sbR.append(", thumbnail_height=");
        sbR.append(num4);
        sbR.append(", telemetry=");
        return ij0.m(sbR, str6, ")");
    }

    private ImageGalleryItem(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, String str6, Integer num3, Integer num4, String str7) {
        ij0.z(str, str2, str3, str4);
        this.id = str;
        this.url = str2;
        this.title = str3;
        this.source = str4;
        this.page_url = str5;
        this.width = num;
        this.height = num2;
        this.thumbnail_url = str6;
        this.thumbnail_width = num3;
        this.thumbnail_height = num4;
        this.telemetry = str7;
        PixelSize.Companion.getClass();
        this.imageSize = a3d.a(num, num2);
        this.thumbnailSize = a3d.a(num3, num4);
    }

    public /* synthetic */ ImageGalleryItem(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, String str6, Integer num3, Integer num4, String str7, mq5 mq5Var) {
        this(str, str2, str3, str4, str5, num, num2, str6, num3, num4, str7);
    }

    public /* synthetic */ ImageGalleryItem(int i, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, String str6, Integer num3, Integer num4, String str7, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, str3, str4, str5, num, num2, str6, num3, num4, str7, vnfVar);
    }

    public /* synthetic */ ImageGalleryItem(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, String str6, Integer num3, Integer num4, String str7, int i, mq5 mq5Var) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : str6, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : num3, (i & 512) != 0 ? null : num4, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : str7, null);
    }
}
