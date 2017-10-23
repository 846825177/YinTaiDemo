package com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.entity;

import java.util.List;

/**
 * Created by 张扬帆 on 2017/10/20.
 */

public class Forestall {
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

        private int bookingcount;
        private int current_page;
        private int futurecount;
        private boolean isbooking;
        private int nowcount;
        private int page_count;
        private int record_count;
        private List<ActivityinfoBean> activityinfo;
        private List<CategorysBean> categorys;

        public int getBookingcount() {
            return bookingcount;
        }

        public void setBookingcount(int bookingcount) {
            this.bookingcount = bookingcount;
        }

        public int getCurrent_page() {
            return current_page;
        }

        public void setCurrent_page(int current_page) {
            this.current_page = current_page;
        }

        public int getFuturecount() {
            return futurecount;
        }

        public void setFuturecount(int futurecount) {
            this.futurecount = futurecount;
        }

        public boolean isIsbooking() {
            return isbooking;
        }

        public void setIsbooking(boolean isbooking) {
            this.isbooking = isbooking;
        }

        public int getNowcount() {
            return nowcount;
        }

        public void setNowcount(int nowcount) {
            this.nowcount = nowcount;
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

        public List<ActivityinfoBean> getActivityinfo() {
            return activityinfo;
        }

        public void setActivityinfo(List<ActivityinfoBean> activityinfo) {
            this.activityinfo = activityinfo;
        }

        public List<CategorysBean> getCategorys() {
            return categorys;
        }

        public void setCategorys(List<CategorysBean> categorys) {
            this.categorys = categorys;
        }

        public static class ActivityinfoBean {

            private String starttime;
            private List<ActivitylistBean> activitylist;

            public String getStarttime() {
                return starttime;
            }

            public void setStarttime(String starttime) {
                this.starttime = starttime;
            }

            public List<ActivitylistBean> getActivitylist() {
                return activitylist;
            }

            public void setActivitylist(List<ActivitylistBean> activitylist) {
                this.activitylist = activitylist;
            }

            public static class ActivitylistBean {
                private int appimglabel;
                private String brandname;
                private String discount;
                private String endtime;
                private int id;
                private String imgurl;
                private int islabel;
                private String leftsecond;
                private String logo;
                private String logoimage;
                private String name;
                private String starttime;
                private String tagurl;
                private String title;

                public int getAppimglabel() {
                    return appimglabel;
                }

                public void setAppimglabel(int appimglabel) {
                    this.appimglabel = appimglabel;
                }

                public String getBrandname() {
                    return brandname;
                }

                public void setBrandname(String brandname) {
                    this.brandname = brandname;
                }

                public String getDiscount() {
                    return discount;
                }

                public void setDiscount(String discount) {
                    this.discount = discount;
                }

                public String getEndtime() {
                    return endtime;
                }

                public void setEndtime(String endtime) {
                    this.endtime = endtime;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getImgurl() {
                    return imgurl;
                }

                public void setImgurl(String imgurl) {
                    this.imgurl = imgurl;
                }

                public int getIslabel() {
                    return islabel;
                }

                public void setIslabel(int islabel) {
                    this.islabel = islabel;
                }

                public String getLeftsecond() {
                    return leftsecond;
                }

                public void setLeftsecond(String leftsecond) {
                    this.leftsecond = leftsecond;
                }

                public String getLogo() {
                    return logo;
                }

                public void setLogo(String logo) {
                    this.logo = logo;
                }

                public String getLogoimage() {
                    return logoimage;
                }

                public void setLogoimage(String logoimage) {
                    this.logoimage = logoimage;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getStarttime() {
                    return starttime;
                }

                public void setStarttime(String starttime) {
                    this.starttime = starttime;
                }

                public String getTagurl() {
                    return tagurl;
                }

                public void setTagurl(String tagurl) {
                    this.tagurl = tagurl;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                @Override
                public String toString() {
                    return "ActivitylistBean{" +
                            "appimglabel=" + appimglabel +
                            ", brandname='" + brandname + '\'' +
                            ", discount='" + discount + '\'' +
                            ", endtime='" + endtime + '\'' +
                            ", id=" + id +
                            ", imgurl='" + imgurl + '\'' +
                            ", islabel=" + islabel +
                            ", leftsecond='" + leftsecond + '\'' +
                            ", logo='" + logo + '\'' +
                            ", logoimage='" + logoimage + '\'' +
                            ", name='" + name + '\'' +
                            ", starttime='" + starttime + '\'' +
                            ", tagurl='" + tagurl + '\'' +
                            ", title='" + title + '\'' +
                            '}';
                }
            }

            @Override
            public String toString() {
                return "ActivityinfoBean{" +
                        "starttime='" + starttime + '\'' +
                        ", activitylist=" + activitylist +
                        '}';
            }
        }

        public static class CategorysBean {
            /**
             * categoryid : 391,7119
             * name : 热销
             * type : 4
             */

            private String categoryid;
            private String name;
            private int type;

            public String getCategoryid() {
                return categoryid;
            }

            public void setCategoryid(String categoryid) {
                this.categoryid = categoryid;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            @Override
            public String toString() {
                return "CategorysBean{" +
                        "categoryid='" + categoryid + '\'' +
                        ", name='" + name + '\'' +
                        ", type=" + type +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "bookingcount=" + bookingcount +
                    ", current_page=" + current_page +
                    ", futurecount=" + futurecount +
                    ", isbooking=" + isbooking +
                    ", nowcount=" + nowcount +
                    ", page_count=" + page_count +
                    ", record_count=" + record_count +
                    ", activityinfo=" + activityinfo +
                    ", categorys=" + categorys +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Forestall{" +
                "data=" + data +
                ", description='" + description + '\'' +
                ", isSuccessful=" + isSuccessful +
                ", statusCode=" + statusCode +
                ", userId='" + userId + '\'' +
                '}';
    }
}
