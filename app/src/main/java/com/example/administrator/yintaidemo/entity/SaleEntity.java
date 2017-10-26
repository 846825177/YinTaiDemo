package com.example.administrator.yintaidemo.entity;

import java.util.List;

/**
 * Created by 张扬帆 on 2017/10/24.
 */

public class SaleEntity {
    private DataBean data;
    private String description;
    private boolean isSuccessful;
    private int statusCode;
    private String userId;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isIsSuccessful() {
        return isSuccessful;
    }

    public void setIsSuccessful(boolean isSuccessful) {
        this.isSuccessful = isSuccessful;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public static class DataBean {

        private String activitydiscount;
        private String barginname;
        private int current_page;
        private boolean displayCollectionIcon;
        private String historydesc;
        private String leftsecond;
        private int page_count;
        private int record_count;
        private int showtype;
        private List<FilterGroupBean> filter_group;
        private List<ProductListBean> product_list;

        public String getActivitydiscount() {
            return activitydiscount;
        }

        public void setActivitydiscount(String activitydiscount) {
            this.activitydiscount = activitydiscount;
        }

        public String getBarginname() {
            return barginname;
        }

        public void setBarginname(String barginname) {
            this.barginname = barginname;
        }

        public int getCurrent_page() {
            return current_page;
        }

        public void setCurrent_page(int current_page) {
            this.current_page = current_page;
        }

        public boolean isDisplayCollectionIcon() {
            return displayCollectionIcon;
        }

        public void setDisplayCollectionIcon(boolean displayCollectionIcon) {
            this.displayCollectionIcon = displayCollectionIcon;
        }

        public String getHistorydesc() {
            return historydesc;
        }

        public void setHistorydesc(String historydesc) {
            this.historydesc = historydesc;
        }

        public String getLeftsecond() {
            return leftsecond;
        }

        public void setLeftsecond(String leftsecond) {
            this.leftsecond = leftsecond;
        }

        public int getPage_count() {
            return page_count;
        }

        public void setPage_count(int page_count) {
            this.page_count = page_count;
        }

        public int getRecord_count() {
            return record_count;
        }

        public void setRecord_count(int record_count) {
            this.record_count = record_count;
        }

        public int getShowtype() {
            return showtype;
        }

        public void setShowtype(int showtype) {
            this.showtype = showtype;
        }

        public List<FilterGroupBean> getFilter_group() {
            return filter_group;
        }

        public void setFilter_group(List<FilterGroupBean> filter_group) {
            this.filter_group = filter_group;
        }

        public List<ProductListBean> getProduct_list() {
            return product_list;
        }

        public void setProduct_list(List<ProductListBean> product_list) {
            this.product_list = product_list;
        }

        public static class FilterGroupBean {

            private String title;
            private List<ItemsBean> items;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public List<ItemsBean> getItems() {
                return items;
            }

            public void setItems(List<ItemsBean> items) {
                this.items = items;
            }

            public static class ItemsBean {
                /**
                 * count : 28
                 * icon :
                 * name : 防辐射服
                 * value : 10001829
                 */

                private int count;
                private String icon;
                private String name;
                private String value;

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }

                @Override
                public String toString() {
                    return "ItemsBean{" +
                            "count=" + count +
                            ", icon='" + icon + '\'' +
                            ", name='" + name + '\'' +
                            ", value='" + value + '\'' +
                            '}';
                }
            }

            @Override
            public String toString() {
                return "FilterGroupBean{" +
                        "title='" + title + '\'' +
                        ", items=" + items +
                        '}';
            }
        }

        public static class ProductListBean {


            private String bigimageurl;
            private int brandid;
            private String brandname;
            private int categoryid;
            private String discount;
            private String groupno;
            private String image;
            private boolean instock;
            private boolean isexclusivemobile;
            private boolean isjumph5;
            private boolean ismiaowgoods;
            private String itemcode;
            private String jumph5url;
            private String midimageurl;
            private String name;
            private int operatemode;
            private double price;
            private int producttype;
            private double promotion_price;
            private String promotionlabel;
            private int providercode;
            private double yt_price;
            private List<PromotionlistBean> promotionlist;
            private List<?> promotions;

            public String getBigimageurl() {
                return bigimageurl;
            }

            public void setBigimageurl(String bigimageurl) {
                this.bigimageurl = bigimageurl;
            }

            public int getBrandid() {
                return brandid;
            }

            public void setBrandid(int brandid) {
                this.brandid = brandid;
            }

            public String getBrandname() {
                return brandname;
            }

            public void setBrandname(String brandname) {
                this.brandname = brandname;
            }

            public int getCategoryid() {
                return categoryid;
            }

            public void setCategoryid(int categoryid) {
                this.categoryid = categoryid;
            }

            public String getDiscount() {
                return discount;
            }

            public void setDiscount(String discount) {
                this.discount = discount;
            }

            public String getGroupno() {
                return groupno;
            }

            public void setGroupno(String groupno) {
                this.groupno = groupno;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public boolean isInstock() {
                return instock;
            }

            public void setInstock(boolean instock) {
                this.instock = instock;
            }

            public boolean isIsexclusivemobile() {
                return isexclusivemobile;
            }

            public void setIsexclusivemobile(boolean isexclusivemobile) {
                this.isexclusivemobile = isexclusivemobile;
            }

            public boolean isIsjumph5() {
                return isjumph5;
            }

            public void setIsjumph5(boolean isjumph5) {
                this.isjumph5 = isjumph5;
            }

            public boolean isIsmiaowgoods() {
                return ismiaowgoods;
            }

            public void setIsmiaowgoods(boolean ismiaowgoods) {
                this.ismiaowgoods = ismiaowgoods;
            }

            public String getItemcode() {
                return itemcode;
            }

            public void setItemcode(String itemcode) {
                this.itemcode = itemcode;
            }

            public String getJumph5url() {
                return jumph5url;
            }

            public void setJumph5url(String jumph5url) {
                this.jumph5url = jumph5url;
            }

            public String getMidimageurl() {
                return midimageurl;
            }

            public void setMidimageurl(String midimageurl) {
                this.midimageurl = midimageurl;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getOperatemode() {
                return operatemode;
            }

            public void setOperatemode(int operatemode) {
                this.operatemode = operatemode;
            }

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            public int getProducttype() {
                return producttype;
            }

            public void setProducttype(int producttype) {
                this.producttype = producttype;
            }

            public double getPromotion_price() {
                return promotion_price;
            }

            public void setPromotion_price(double promotion_price) {
                this.promotion_price = promotion_price;
            }

            public String getPromotionlabel() {
                return promotionlabel;
            }

            public void setPromotionlabel(String promotionlabel) {
                this.promotionlabel = promotionlabel;
            }

            public int getProvidercode() {
                return providercode;
            }

            public void setProvidercode(int providercode) {
                this.providercode = providercode;
            }

            public double getYt_price() {
                return yt_price;
            }

            public void setYt_price(double yt_price) {
                this.yt_price = yt_price;
            }

            public List<PromotionlistBean> getPromotionlist() {
                return promotionlist;
            }

            public void setPromotionlist(List<PromotionlistBean> promotionlist) {
                this.promotionlist = promotionlist;
            }

            public List<?> getPromotions() {
                return promotions;
            }

            public void setPromotions(List<?> promotions) {
                this.promotions = promotions;
            }

            public static class PromotionlistBean {
                /**
                 * name : 特卖
                 * pid : 27004
                 * plabel : 特卖
                 */

                private String name;
                private String pid;
                private String plabel;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getPid() {
                    return pid;
                }

                public void setPid(String pid) {
                    this.pid = pid;
                }

                public String getPlabel() {
                    return plabel;
                }

                public void setPlabel(String plabel) {
                    this.plabel = plabel;
                }

                @Override
                public String toString() {
                    return "PromotionlistBean{" +
                            "name='" + name + '\'' +
                            ", pid='" + pid + '\'' +
                            ", plabel='" + plabel + '\'' +
                            '}';
                }
            }

            @Override
            public String toString() {
                return "ProductListBean{" +
                        "bigimageurl='" + bigimageurl + '\'' +
                        ", brandid=" + brandid +
                        ", brandname='" + brandname + '\'' +
                        ", categoryid=" + categoryid +
                        ", discount='" + discount + '\'' +
                        ", groupno='" + groupno + '\'' +
                        ", image='" + image + '\'' +
                        ", instock=" + instock +
                        ", isexclusivemobile=" + isexclusivemobile +
                        ", isjumph5=" + isjumph5 +
                        ", ismiaowgoods=" + ismiaowgoods +
                        ", itemcode='" + itemcode + '\'' +
                        ", jumph5url='" + jumph5url + '\'' +
                        ", midimageurl='" + midimageurl + '\'' +
                        ", name='" + name + '\'' +
                        ", operatemode=" + operatemode +
                        ", price=" + price +
                        ", producttype=" + producttype +
                        ", promotion_price=" + promotion_price +
                        ", promotionlabel='" + promotionlabel + '\'' +
                        ", providercode=" + providercode +
                        ", yt_price=" + yt_price +
                        ", promotionlist=" + promotionlist +
                        ", promotions=" + promotions +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "activitydiscount='" + activitydiscount + '\'' +
                    ", barginname='" + barginname + '\'' +
                    ", current_page=" + current_page +
                    ", displayCollectionIcon=" + displayCollectionIcon +
                    ", historydesc='" + historydesc + '\'' +
                    ", leftsecond='" + leftsecond + '\'' +
                    ", page_count=" + page_count +
                    ", record_count=" + record_count +
                    ", showtype=" + showtype +
                    ", filter_group=" + filter_group +
                    ", product_list=" + product_list +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "SaleEntity{" +
                "data=" + data +
                ", description='" + description + '\'' +
                ", isSuccessful=" + isSuccessful +
                ", statusCode=" + statusCode +
                ", userId='" + userId + '\'' +
                '}';
    }
}
